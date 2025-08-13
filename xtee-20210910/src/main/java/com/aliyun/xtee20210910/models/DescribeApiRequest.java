// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeApiRequest extends TeaModel {
    /**
     * <p>Set the language type for requests and received messages, default value is <strong>zh</strong>. Values: </p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>API unique ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>33</p>
     */
    @NameInMap("apiId")
    public String apiId;

    /**
     * <p>Region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou、cn-shanghai</p>
     */
    @NameInMap("apiRegionId")
    public String apiRegionId;

    /**
     * <p>API type</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SELF</p>
     */
    @NameInMap("apiType")
    public String apiType;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    public static DescribeApiRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiRequest self = new DescribeApiRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApiRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeApiRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DescribeApiRequest setApiRegionId(String apiRegionId) {
        this.apiRegionId = apiRegionId;
        return this;
    }
    public String getApiRegionId() {
        return this.apiRegionId;
    }

    public DescribeApiRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public DescribeApiRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
