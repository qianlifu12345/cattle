/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HostVnetMapTable extends org.jooq.impl.TableImpl<io.cattle.platform.core.model.tables.records.HostVnetMapRecord> {

	private static final long serialVersionUID = -1248573358;

	/**
	 * The singleton instance of <code>cattle.host_vnet_map</code>
	 */
	public static final io.cattle.platform.core.model.tables.HostVnetMapTable HOST_VNET_MAP = new io.cattle.platform.core.model.tables.HostVnetMapTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.cattle.platform.core.model.tables.records.HostVnetMapRecord> getRecordType() {
		return io.cattle.platform.core.model.tables.records.HostVnetMapRecord.class;
	}

	/**
	 * The column <code>cattle.host_vnet_map.id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.HostVnetMapRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>cattle.host_vnet_map.name</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.HostVnetMapRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.host_vnet_map.kind</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.HostVnetMapRecord, java.lang.String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>cattle.host_vnet_map.uuid</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.HostVnetMapRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.host_vnet_map.description</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.HostVnetMapRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * The column <code>cattle.host_vnet_map.state</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.HostVnetMapRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.host_vnet_map.created</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.HostVnetMapRecord, java.util.Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.host_vnet_map.removed</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.HostVnetMapRecord, java.util.Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.host_vnet_map.remove_time</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.HostVnetMapRecord, java.util.Date> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.host_vnet_map.data</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.HostVnetMapRecord, java.util.Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB.length(65535).asConvertedDataType(new io.cattle.platform.db.jooq.converter.DataConverter()), this, "");

	/**
	 * The column <code>cattle.host_vnet_map.host_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.HostVnetMapRecord, java.lang.Long> HOST_ID = createField("host_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.host_vnet_map.vnet_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.HostVnetMapRecord, java.lang.Long> VNET_ID = createField("vnet_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>cattle.host_vnet_map</code> table reference
	 */
	public HostVnetMapTable() {
		this("host_vnet_map", null);
	}

	/**
	 * Create an aliased <code>cattle.host_vnet_map</code> table reference
	 */
	public HostVnetMapTable(java.lang.String alias) {
		this(alias, io.cattle.platform.core.model.tables.HostVnetMapTable.HOST_VNET_MAP);
	}

	private HostVnetMapTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.HostVnetMapRecord> aliased) {
		this(alias, aliased, null);
	}

	private HostVnetMapTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.HostVnetMapRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, io.cattle.platform.core.model.CattleTable.CATTLE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.cattle.platform.core.model.tables.records.HostVnetMapRecord, java.lang.Long> getIdentity() {
		return io.cattle.platform.core.model.Keys.IDENTITY_HOST_VNET_MAP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.HostVnetMapRecord> getPrimaryKey() {
		return io.cattle.platform.core.model.Keys.KEY_HOST_VNET_MAP_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.HostVnetMapRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.HostVnetMapRecord>>asList(io.cattle.platform.core.model.Keys.KEY_HOST_VNET_MAP_PRIMARY, io.cattle.platform.core.model.Keys.KEY_HOST_VNET_MAP_IDX_HOST_VNET_MAP_UUID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.HostVnetMapRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.HostVnetMapRecord, ?>>asList(io.cattle.platform.core.model.Keys.FK_HOST_VNET_MAP__HOST_ID, io.cattle.platform.core.model.Keys.FK_HOST_VNET_MAP__VNET_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.cattle.platform.core.model.tables.HostVnetMapTable as(java.lang.String alias) {
		return new io.cattle.platform.core.model.tables.HostVnetMapTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public io.cattle.platform.core.model.tables.HostVnetMapTable rename(java.lang.String name) {
		return new io.cattle.platform.core.model.tables.HostVnetMapTable(name, null);
	}
}
