// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class SubmitApplyRecordRequest extends TeaModel {
    /**
     * <p>The request reason.</p>
     * <ul>
     * <li><strong>AR01</strong>: Rectified. Request to unblock.</li>
     * <li><strong>AR02</strong>: No violation found after investigation.</li>
     * <li><strong>AR03</strong>: The instance or service has been shut down and cannot be operated. Request to unblock and then clear the violation information.</li>
     * <li><strong>AR04</strong>: Files deleted. Request to unblock.</li>
     * <li><strong>AR05</strong>: The instance has been released.</li>
     * <li><strong>AR00</strong>: Other. Provide a description.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AR01</p>
     */
    @NameInMap("ApplyRequest")
    public String applyRequest;

    /**
     * <p>The commitment letter.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;fileName\&quot;:\&quot;5a4b4xxxxd0b6.png\&quot;,\&quot;filePath\&quot;:\&quot;xxx/1cxxx7d0202.png\&quot;,\&quot;name\&quot;:\&quot;5axxxc1d0b6.png\&quot;}]</p>
     */
    @NameInMap("CommitmentLetter")
    public String commitmentLetter;

    /**
     * <p>The description of the situation.</p>
     * 
     * <strong>example:</strong>
     * <p>Rectification completed. Related websites have been shut down.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The list of specified event IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>43029423</p>
     */
    @NameInMap("EventIdList")
    public java.util.List<String> eventIdList;

    /**
     * <p>The qualification proof.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;fileName\&quot;:\&quot;5a4b4xxxxd0b6.png\&quot;,\&quot;filePath\&quot;:\&quot;xxx/1cxxx7d0202.png\&quot;,\&quot;name\&quot;:\&quot;5axxxc1d0b6.png\&quot;}]</p>
     */
    @NameInMap("QualificationProof")
    public String qualificationProof;

    /**
     * <p>Specifies whether manual review is required.</p>
     * <ul>
     * <li><strong>true</strong>: Manual review is required.</li>
     * <li><strong>false</strong>: Manual review is not required.</li>
     * </ul>
     * <blockquote>
     * <p>Default value: manual review is not required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Trial")
    public Boolean trial;

    public static SubmitApplyRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitApplyRecordRequest self = new SubmitApplyRecordRequest();
        return TeaModel.build(map, self);
    }

    public SubmitApplyRecordRequest setApplyRequest(String applyRequest) {
        this.applyRequest = applyRequest;
        return this;
    }
    public String getApplyRequest() {
        return this.applyRequest;
    }

    public SubmitApplyRecordRequest setCommitmentLetter(String commitmentLetter) {
        this.commitmentLetter = commitmentLetter;
        return this;
    }
    public String getCommitmentLetter() {
        return this.commitmentLetter;
    }

    public SubmitApplyRecordRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitApplyRecordRequest setEventIdList(java.util.List<String> eventIdList) {
        this.eventIdList = eventIdList;
        return this;
    }
    public java.util.List<String> getEventIdList() {
        return this.eventIdList;
    }

    public SubmitApplyRecordRequest setQualificationProof(String qualificationProof) {
        this.qualificationProof = qualificationProof;
        return this;
    }
    public String getQualificationProof() {
        return this.qualificationProof;
    }

    public SubmitApplyRecordRequest setTrial(Boolean trial) {
        this.trial = trial;
        return this;
    }
    public Boolean getTrial() {
        return this.trial;
    }

}
