public abstract class Resource
{
    public abstract int allocate();
	public abstract void free(ResourceType resourceType, int resourceId)
}