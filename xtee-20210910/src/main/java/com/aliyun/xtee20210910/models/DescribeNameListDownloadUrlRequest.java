// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeNameListDownloadUrlRequest extends TeaModel {
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
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Variable ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>762</p>
     */
    @NameInMap("variableId")
    public Long variableId;

    public static DescribeNameListDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNameListDownloadUrlRequest self = new DescribeNameListDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNameListDownloadUrlRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeNameListDownloadUrlRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeNameListDownloadUrlRequest setVariableId(Long variableId) {
        this.variableId = variableId;
        return this;
    }
    public Long getVariableId() {
        return this.variableId;
    }

}
