// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ConfirmPipelineBatchRequest extends TeaModel {
    /**
     * <p>true</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Confirm")
    public Boolean confirm;

    /**
     * <p>The ID of the batch. You can call the <a href="https://www.alibabacloud.com/help/zh/sae/serverless-app-engine-classic/developer-reference/api-sae-2019-05-06-describechangeorder-old?spm=a2c63.p38356.help-menu-search-118957.d_0">DescribeChangeOrder</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e2e-vds-feh-***</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    public static ConfirmPipelineBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmPipelineBatchRequest self = new ConfirmPipelineBatchRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmPipelineBatchRequest setConfirm(Boolean confirm) {
        this.confirm = confirm;
        return this;
    }
    public Boolean getConfirm() {
        return this.confirm;
    }

    public ConfirmPipelineBatchRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

}
