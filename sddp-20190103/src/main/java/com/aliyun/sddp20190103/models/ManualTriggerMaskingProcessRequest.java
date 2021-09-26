// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ManualTriggerMaskingProcessRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("Id")
    public Long id;

    public static ManualTriggerMaskingProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        ManualTriggerMaskingProcessRequest self = new ManualTriggerMaskingProcessRequest();
        return TeaModel.build(map, self);
    }

    public ManualTriggerMaskingProcessRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ManualTriggerMaskingProcessRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
