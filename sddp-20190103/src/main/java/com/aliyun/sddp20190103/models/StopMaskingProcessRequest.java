// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class StopMaskingProcessRequest extends TeaModel {
    /**
     * <p>The unique ID of the data masking task. You can obtain the ID of a data masking task from the return value of the <a href="~~DescribeDataMaskingTasks~~">DescribeDataMaskingTasks</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh_cn</strong>: Chinese (Simplified). This is the default value.</p>
     * </li>
     * <li><p><strong>en_us</strong>: English (US).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static StopMaskingProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        StopMaskingProcessRequest self = new StopMaskingProcessRequest();
        return TeaModel.build(map, self);
    }

    public StopMaskingProcessRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public StopMaskingProcessRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
