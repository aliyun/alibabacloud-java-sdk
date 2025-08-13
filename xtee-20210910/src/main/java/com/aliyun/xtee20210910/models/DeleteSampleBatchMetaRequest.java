// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeleteSampleBatchMetaRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values: </p>
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
     * <p>UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>jigaklba83ka</p>
     */
    @NameInMap("batchUuid")
    public String batchUuid;

    /**
     * <p>Region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    public static DeleteSampleBatchMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSampleBatchMetaRequest self = new DeleteSampleBatchMetaRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSampleBatchMetaRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteSampleBatchMetaRequest setBatchUuid(String batchUuid) {
        this.batchUuid = batchUuid;
        return this;
    }
    public String getBatchUuid() {
        return this.batchUuid;
    }

    public DeleteSampleBatchMetaRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
