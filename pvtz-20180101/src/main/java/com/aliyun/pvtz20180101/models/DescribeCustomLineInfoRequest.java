// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeCustomLineInfoRequest extends TeaModel {
    /**
     * <p>The language of the response.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The unique ID of the custom line.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11271</p>
     */
    @NameInMap("LineId")
    public String lineId;

    public static DescribeCustomLineInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomLineInfoRequest self = new DescribeCustomLineInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomLineInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeCustomLineInfoRequest setLineId(String lineId) {
        this.lineId = lineId;
        return this;
    }
    public String getLineId() {
        return this.lineId;
    }

}
