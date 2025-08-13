// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAnalysisColumnFieldListRequest extends TeaModel {
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
     * <p>Region code</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    public static DescribeAnalysisColumnFieldListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnalysisColumnFieldListRequest self = new DescribeAnalysisColumnFieldListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAnalysisColumnFieldListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAnalysisColumnFieldListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
