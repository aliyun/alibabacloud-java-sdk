// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeOpenApiInfoRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DescribePopApiItemList</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>The version number of the API.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeGroupProductions~~">DescribeGroupProductions</a> operation to query version numbers.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-12-03</p>
     */
    @NameInMap("ApiVersion")
    public String apiVersion;

    /**
     * <p>The language of the content within the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
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
     * <p>1592757xxx002956</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The type of the view. Valid values:</p>
     * <ul>
     * <li>0 (default): the view of the current Alibaba Cloud account.</li>
     * <li>1: the view of all accounts for the enterprise.</li>
     * </ul>
     * 
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
