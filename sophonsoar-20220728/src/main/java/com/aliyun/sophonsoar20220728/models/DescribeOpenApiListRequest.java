// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeOpenApiListRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform.</p>
     * 
     * <strong>example:</strong>
     * <p>DescribePopApiItemList</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>The version number of the API.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeGroupProductions~~">DescribeGroupProductions</a> operation to query the version number.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-10-01</p>
     */
    @NameInMap("ApiVersion")
    public String apiVersion;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The POP code of the Alibaba Cloud service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Sas</p>
     */
    @NameInMap("PopCode")
    public String popCode;

    /**
     * <p>The ID of the user who switches from the current view to the destination view by using the management account.</p>
     * 
     * <strong>example:</strong>
     * <p>137602xxx8718726</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The type of the view. Default value: 0. Valid values:</p>
     * <ul>
     * <li>0: the view of the current Alibaba Cloud account.</li>
     * <li>1: the view of all accounts for the enterprise.</li>
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
