CREATE TABLE rounds (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    game_id UUID NOT NULL,
    sorted_numbers INTEGER[] NOT NULL,
    CONSTRAINT fk_game_id FOREIGN KEY (game_id) REFERENCES games(id)
);
