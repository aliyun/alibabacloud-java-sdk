// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class BatchDeleteSampleDataRequest extends TeaModel {
    /**
     * <p>Language of the error message returned by the interface. Values: zh: Chinese; en: English. Default is en.</p>
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
     * <p>UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>89cd3e44cd2f4a529fb020f3bab3ee1c</p>
     */
    @NameInMap("uuids")
    public String uuids;

    public static BatchDeleteSampleDataRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteSampleDataRequest self = new BatchDeleteSampleDataRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteSampleDataRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public BatchDeleteSampleDataRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public BatchDeleteSampleDataRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
