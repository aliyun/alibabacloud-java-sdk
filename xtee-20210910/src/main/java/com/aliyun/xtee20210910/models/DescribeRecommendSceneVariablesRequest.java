// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRecommendSceneVariablesRequest extends TeaModel {
    /**
     * <p>The language type for the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>The ID of the data sample.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5467</p>
     */
    @NameInMap("sampleId")
    public Long sampleId;

    public static DescribeRecommendSceneVariablesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecommendSceneVariablesRequest self = new DescribeRecommendSceneVariablesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRecommendSceneVariablesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRecommendSceneVariablesRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeRecommendSceneVariablesRequest setSampleId(Long sampleId) {
        this.sampleId = sampleId;
        return this;
    }
    public Long getSampleId() {
        return this.sampleId;
    }

}
