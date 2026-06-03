// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListDataSourceAttributeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DbIds")
    public java.util.List<String> dbIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbaudit-cn-78v1gc****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListDataSourceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceAttributeRequest self = new ListDataSourceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ListDataSourceAttributeRequest setDbIds(java.util.List<String> dbIds) {
        this.dbIds = dbIds;
        return this;
    }
    public java.util.List<String> getDbIds() {
        return this.dbIds;
    }

    public ListDataSourceAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDataSourceAttributeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListDataSourceAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
