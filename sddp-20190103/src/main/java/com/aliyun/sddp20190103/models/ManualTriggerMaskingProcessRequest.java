// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ManualTriggerMaskingProcessRequest extends TeaModel {
    /**
     * <p>The ID of the de-identification task.</p>
     * <br>
     * <p>The ID of the de-identification task is a string. You can call the DescribeDataMaskingTasks operation to query the ID.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the content within the request and response, default value zh_cn. Valid values:</p>
     * <br>
     * <p>*   **zh_cn**: Chinese</p>
     * <p>*   **en_us**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static ManualTriggerMaskingProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        ManualTriggerMaskingProcessRequest self = new ManualTriggerMaskingProcessRequest();
        return TeaModel.build(map, self);
    }

    public ManualTriggerMaskingProcessRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ManualTriggerMaskingProcessRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
