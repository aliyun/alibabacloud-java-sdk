// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeApisRequest extends TeaModel {
    /**
     * <p>Set the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
     * <p>API group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3309b0f4b1e243cd8bd9dd029f9c5f0a</p>
     */
    @NameInMap("apiGroupId")
    public String apiGroupId;

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
     * <p>API type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SELF</p>
     */
    @NameInMap("apiType")
    public String apiType;

    /**
     * <p>Region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    public static DescribeApisRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisRequest self = new DescribeApisRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApisRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeApisRequest setApiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
        return this;
    }
    public String getApiGroupId() {
        return this.apiGroupId;
    }

    public DescribeApisRequest setApiRegionId(String apiRegionId) {
        this.apiRegionId = apiRegionId;
        return this;
    }
    public String getApiRegionId() {
        return this.apiRegionId;
    }

    public DescribeApisRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public DescribeApisRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
