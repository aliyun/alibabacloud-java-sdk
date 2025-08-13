// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DownloadSmapleBatchRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
     * <p>Sample batch UUID</p>
     * 
     * <strong>example:</strong>
     * <p>203f1ae65c0a41a49dc4f8a47946caa2</p>
     */
    @NameInMap("batchUuid")
    public String batchUuid;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    public static DownloadSmapleBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadSmapleBatchRequest self = new DownloadSmapleBatchRequest();
        return TeaModel.build(map, self);
    }

    public DownloadSmapleBatchRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DownloadSmapleBatchRequest setBatchUuid(String batchUuid) {
        this.batchUuid = batchUuid;
        return this;
    }
    public String getBatchUuid() {
        return this.batchUuid;
    }

    public DownloadSmapleBatchRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
