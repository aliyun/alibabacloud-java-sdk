// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class StopMaskingProcessRequest extends TeaModel {
    /**
     * <p>The unique ID of the de-identification task. You can query the task ID by calling the <a href="~~DescribeDataMaskingTasks~~">DescribeDataMaskingTasks</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Simplified Chinese (default)</li>
     * <li><strong>en_us</strong>: English</li>
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
