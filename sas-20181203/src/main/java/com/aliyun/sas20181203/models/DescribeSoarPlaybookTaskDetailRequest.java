// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSoarPlaybookTaskDetailRequest extends TeaModel {
    /**
     * <p>Playbook ID.</p>
     * <blockquote>
     * <p>You can obtain this parameter by calling the <a href="https://help.aliyun.com/document_detail/2627461.html">DescribePlaybooks</a> interface.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("PlaybookId")
    public Long playbookId;

    /**
     * <p>The vulnerability ID passed when creating the policy task.</p>
     * <blockquote>
     * <p>You can obtain this parameter by calling the <a href="~~DescribeVulList~~">DescribeVulList</a> interface.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>14</p>
     */
    @NameInMap("RecordId")
    public Long recordId;

    /**
     * <p>UUID of the playbook task execution.</p>
     * <blockquote>
     * <p>You can obtain this parameter by calling the <a href="https://help.aliyun.com/document_detail/2627455.html">DescribeSoarRecords</a> interface.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a15e37da-abe0-4d87-acd2-024e875a****</p>
     */
    @NameInMap("RequestUuid")
    public String requestUuid;

    public static DescribeSoarPlaybookTaskDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarPlaybookTaskDetailRequest self = new DescribeSoarPlaybookTaskDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSoarPlaybookTaskDetailRequest setPlaybookId(Long playbookId) {
        this.playbookId = playbookId;
        return this;
    }
    public Long getPlaybookId() {
        return this.playbookId;
    }

    public DescribeSoarPlaybookTaskDetailRequest setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

    public DescribeSoarPlaybookTaskDetailRequest setRequestUuid(String requestUuid) {
        this.requestUuid = requestUuid;
        return this;
    }
    public String getRequestUuid() {
        return this.requestUuid;
    }

}
