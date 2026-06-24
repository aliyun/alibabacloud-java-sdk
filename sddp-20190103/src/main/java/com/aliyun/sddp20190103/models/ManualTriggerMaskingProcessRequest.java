// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ManualTriggerMaskingProcessRequest extends TeaModel {
    /**
     * <p>The ID of the data masking task. The value is an integer.</p>
     * <blockquote>
     * <p>You can call the DescribeDataMaskingTasks operation to obtain the ID of the data masking task.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the request and response. Default value: zh_cn. Valid values:</p>
     * <ul>
     * <li><p><strong>zh_cn</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en_us</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
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
