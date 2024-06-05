// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class DataCName extends TeaModel {
    @NameInMap("cert_expire_time")
    public Long certExpireTime;

    @NameInMap("cert_name")
    public String certName;

    @NameInMap("cname")
    public String cname;

    @NameInMap("cname_type")
    public String cnameType;

    @NameInMap("location")
    public String location;

    @NameInMap("store_id")
    public String storeId;

    public static DataCName build(java.util.Map<String, ?> map) throws Exception {
        DataCName self = new DataCName();
        return TeaModel.build(map, self);
    }

    public DataCName setCertExpireTime(Long certExpireTime) {
        this.certExpireTime = certExpireTime;
        return this;
    }
    public Long getCertExpireTime() {
        return this.certExpireTime;
    }

    public DataCName setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public DataCName setCname(String cname) {
        this.cname = cname;
        return this;
    }
    public String getCname() {
        return this.cname;
    }

    public DataCName setCnameType(String cnameType) {
        this.cnameType = cnameType;
        return this;
    }
    public String getCnameType() {
        return this.cnameType;
    }

    public DataCName setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DataCName setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
