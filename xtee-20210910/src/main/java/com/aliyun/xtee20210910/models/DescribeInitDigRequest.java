// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeInitDigRequest extends TeaModel {
    /**
     * <p>Set the language type for request and response messages. Default value is <strong>zh</strong>. Values:</p>
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
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegId")
    public String regId;

    /**
     * <p>Data source type</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SAF_CONSOLE</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeInitDigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInitDigRequest self = new DescribeInitDigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInitDigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeInitDigRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeInitDigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
