CREATE TYPE payment_status_enum AS ENUM ('PENDING', 'PAID', 'FAILED');

CREATE TABLE bets (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    round_id UUID NOT NULL,
    player_id UUID NOT NULL,
    payment_status payment_status_enum NOT NULL,
    CONSTRAINT fk_round_id FOREIGN KEY (round_id) REFERENCES rounds(id),
    CONSTRAINT fk_player_id FOREIGN KEY (player_id) REFERENCES players(id)
);
