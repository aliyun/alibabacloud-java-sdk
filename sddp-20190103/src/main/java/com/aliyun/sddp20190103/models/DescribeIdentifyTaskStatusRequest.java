// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeIdentifyTaskStatusRequest extends TeaModel {
    /**
     * <p>Task ID, obtained from the ID field in the response after calling CreateScanTask or ScanOssObjectV1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>268</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Language type for request and response messages, default is <strong>zh_cn</strong>. Values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Chinese (Simplified)</li>
     * <li><strong>en_us</strong>: English (United States)</li>
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
