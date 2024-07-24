// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class DataBoxPrivileges extends TeaModel {
    @NameInMap("feature_attr_id")
    public String featureAttrId;

    @NameInMap("feature_id")
    public String featureId;

    @NameInMap("quota")
    public Long quota;

    public static DataBoxPrivileges build(java.util.Map<String, ?> map) throws Exception {
        DataBoxPrivileges self = new DataBoxPrivileges();
        return TeaModel.build(map, self);
    }

    public DataBoxPrivileges setFeatureAttrId(String featureAttrId) {
        this.featureAttrId = featureAttrId;
        return this;
    }
    public String getFeatureAttrId() {
        return this.featureAttrId;
    }

    public DataBoxPrivileges setFeatureId(String featureId) {
        this.featureId = featureId;
        return this;
    }
    public String getFeatureId() {
        return this.featureId;
    }

    public DataBoxPrivileges setQuota(Long quota) {
        this.quota = quota;
        return this;
    }
    public Long getQuota() {
        return this.quota;
    }

}
