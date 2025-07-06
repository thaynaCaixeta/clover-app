CREATE TABLE bets (
     id UUID PRIMARY KEY,
     round_id UUID NOT NULL,
     user_id UUID NOT NULL,
     payment_status TEXT NOT NULL,
     CONSTRAINT fk_round_id FOREIGN KEY(round_id) REFERENCES rounds(id),
     CONSTRAINT fk_user_id FOREIGN KEY(user_id) REFERENCES users(id)
 );