// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ConfirmPipelineBatchRequest extends TeaModel {
    /**
     * <p>Specifies whether to start the next batch. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Start the next batch.</p>
     * </li>
     * <li><p><strong>false</strong>: Terminate the process.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Confirm")
    public Boolean confirm;

    /**
     * <p>The pipeline ID. To obtain the ID, call the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/sae/serverless-app-engine-upgrade/developer-reference/api-sae-2019-05-06-describechangeorder?spm=a2c4g.11186623.help-menu-search-118957.d_0">DescribeChangeOrder</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/sae/serverless-app-engine-classic/developer-reference/api-sae-2019-05-06-describechangeorder-old?spm=a2c63.p38356.help-menu-search-118957.d_0">DescribeChangeOrder</a> operation.</p>
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
