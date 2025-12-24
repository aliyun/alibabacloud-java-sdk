// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePopApiRequest extends TeaModel {
    /**
     * <p>The operation name of the Alibaba Cloud service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DescribeInstanceInfo</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>The version number of the API.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribePopApiVersionList~~">DescribePopApiVersionList</a> operation to query the version number.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-10-01</p>
     */
    @NameInMap("ApiVersion")
    public String apiVersion;

    /**
     * <p>The POP code of the Alibaba Cloud service.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeApiList~~">DescribeApiList</a> operation to query the POP code.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Sas</p>
     */
    @NameInMap("PopCode")
    public String popCode;

    public static DescribePopApiRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePopApiRequest self = new DescribePopApiRequest();
        return TeaModel.build(map, self);
    }

    public DescribePopApiRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public DescribePopApiRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public DescribePopApiRequest setPopCode(String popCode) {
        this.popCode = popCode;
        return this;
    }
    public String getPopCode() {
        return this.popCode;
    }

}
