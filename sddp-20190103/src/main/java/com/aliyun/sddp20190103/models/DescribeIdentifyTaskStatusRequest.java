// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeIdentifyTaskStatusRequest extends TeaModel {
    /**
     * <p>The task ID. You can obtain the task ID from the ID field in the response of the CreateScanTask or ScanOssObjectV1 operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>268</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Simplified Chinese.</li>
     * <li><strong>en_us</strong>: English (US).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeIdentifyTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIdentifyTaskStatusRequest self = new DescribeIdentifyTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIdentifyTaskStatusRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeIdentifyTaskStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
