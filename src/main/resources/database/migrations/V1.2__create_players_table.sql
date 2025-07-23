CREATE TABLE players (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    external_id UUID NOT NULL UNIQUE,
    created_at TIMESTAMP NOT NULL,
    is_active BOOLEAN,
    name VARCHAR(255),
    full_name VARCHAR(255),
    line1 VARCHAR(255),
    line2 VARCHAR(255),
    city VARCHAR(255),
    state VARCHAR(255),
    zip VARCHAR(20),
    country VARCHAR(100)
);
