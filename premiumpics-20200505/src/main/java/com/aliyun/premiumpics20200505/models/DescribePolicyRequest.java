// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class DescribePolicyRequest extends TeaModel {
    /**
     * <p>BizType</p>
     */
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("FileType")
    public String fileType;

    public static DescribePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyRequest self = new DescribePolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolicyRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribePolicyRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
