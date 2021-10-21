// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryCredentialsInfoRequest extends TeaModel {
    @NameInMap("OssKey")
    public String ossKey;

    @NameInMap("MaterialType")
    public String materialType;

    @NameInMap("CompanyName")
    public String companyName;

    public static QueryCredentialsInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCredentialsInfoRequest self = new QueryCredentialsInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryCredentialsInfoRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

    public QueryCredentialsInfoRequest setMaterialType(String materialType) {
        this.materialType = materialType;
        return this;
    }
    public String getMaterialType() {
        return this.materialType;
    }

    public QueryCredentialsInfoRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

}
