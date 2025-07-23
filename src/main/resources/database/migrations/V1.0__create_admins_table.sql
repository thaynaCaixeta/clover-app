CREATE TABLE admins (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    external_id UUID,
    created_at TIMESTAMP,
    is_active BOOLEAN
);