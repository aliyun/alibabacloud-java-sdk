// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeOpenApiListRequest extends TeaModel {
    /**
     * <p>The API name.</p>
     * 
     * <strong>example:</strong>
     * <p>DescribePopApiItemList</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>The API version number.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeGroupProductions~~">DescribeGroupProductions</a> API to get this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-10-01</p>
     */
    @NameInMap("ApiVersion")
    public String apiVersion;

    /**
     * <p>The language type for requests and responses. The default value is <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The POP CODE of the Alibaba Cloud product API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Sas</p>
     */
    @NameInMap("PopCode")
    public String popCode;

    /**
     * <p>The user ID of the member whose perspective the administrator switches to.</p>
     * 
     * <strong>example:</strong>
     * <p>137602xxx8718726</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The view type. The default is 0. Values:</p>
     * <ul>
     * <li><p>0: Current Alibaba Cloud account view.</p>
     * </li>
     * <li><p>1: View of all accounts under the enterprise.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RoleType")
    public String roleType;

    public static DescribeOpenApiListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenApiListRequest self = new DescribeOpenApiListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOpenApiListRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public DescribeOpenApiListRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public DescribeOpenApiListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeOpenApiListRequest setPopCode(String popCode) {
        this.popCode = popCode;
        return this;
    }
    public String getPopCode() {
        return this.popCode;
    }

    public DescribeOpenApiListRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public DescribeOpenApiListRequest setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

}
