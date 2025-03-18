// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeOpenApiInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DescribePopApiItemList</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-12-03</p>
     */
    @NameInMap("ApiVersion")
    public String apiVersion;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Sas</p>
     */
    @NameInMap("PopCode")
    public String popCode;

    /**
     * <strong>example:</strong>
     * <p>1592757xxx002956</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RoleType")
    public String roleType;

    public static DescribeOpenApiInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenApiInfoRequest self = new DescribeOpenApiInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOpenApiInfoRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public DescribeOpenApiInfoRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public DescribeOpenApiInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeOpenApiInfoRequest setPopCode(String popCode) {
        this.popCode = popCode;
        return this;
    }
    public String getPopCode() {
        return this.popCode;
    }

    public DescribeOpenApiInfoRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public DescribeOpenApiInfoRequest setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

}
