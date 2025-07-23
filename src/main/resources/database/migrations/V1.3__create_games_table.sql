CREATE TABLE games (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    number_of_rounds INTEGER,
    created_at TIMESTAMP,
    closes_at TIMESTAMP,
    status VARCHAR(255),
    created_by UUID NOT NULL,
    CONSTRAINT fk_created_by
        FOREIGN KEY (created_by) REFERENCES admins(id)
);
