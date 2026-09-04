// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLProgressBuffer extends TeaModel {
    /**
     * <p>The total number of consumed samples in incomplete buffers.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Consumed")
    public Integer consumed;

    /**
     * <p>The buffer details split by tag.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Tag&quot;:1,&quot;Ready&quot;:500,&quot;Consumed&quot;:0,&quot;Finished&quot;:500,&quot;Total&quot;:512}]</p>
     */
    @NameInMap("Detail")
    public java.util.List<RLProgressBufferDetail> detail;

    /**
     * <p>The estimated number of remaining seconds to fill the buffer.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("EtaSec")
    public Long etaSec;

    /**
     * <p>The fill rate in entries per minute, estimated by using the rollout completion rate as a proxy.</p>
     * 
     * <strong>example:</strong>
     * <p>120.5</p>
     */
    @NameInMap("FillRatePerMin")
    public Double fillRatePerMin;

    /**
     * <p>The total number of finished samples in incomplete buffers.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("Finished")
    public Integer finished;

    /**
     * <p>The readiness percentage, which is the ratio of Ready to Target.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Pct")
    public Double pct;

    /**
     * <p>The total number of ready samples in incomplete buffers.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("Ready")
    public Integer ready;

    /**
     * <p>The total number of target samples in incomplete buffers.</p>
     * 
     * <strong>example:</strong>
     * <p>512</p>
     */
    @NameInMap("Target")
    public Integer target;

    /**
     * <p>The configured training batch size.</p>
     * 
     * <strong>example:</strong>
     * <p>512</p>
     */
    @NameInMap("TrainBatchSize")
    public Integer trainBatchSize;

    /**
     * <p>Indicates whether Consumed is greater than 0, which means the batch has been fetched and the trainer is updating.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Training")
    public Boolean training;

    public static RLProgressBuffer build(java.util.Map<String, ?> map) throws Exception {
        RLProgressBuffer self = new RLProgressBuffer();
        return TeaModel.build(map, self);
    }

    public RLProgressBuffer setConsumed(Integer consumed) {
        this.consumed = consumed;
        return this;
    }
    public Integer getConsumed() {
        return this.consumed;
    }

    public RLProgressBuffer setDetail(java.util.List<RLProgressBufferDetail> detail) {
        this.detail = detail;
        return this;
    }
    public java.util.List<RLProgressBufferDetail> getDetail() {
        return this.detail;
    }

    public RLProgressBuffer setEtaSec(Long etaSec) {
        this.etaSec = etaSec;
        return this;
    }
    public Long getEtaSec() {
        return this.etaSec;
    }

    public RLProgressBuffer setFillRatePerMin(Double fillRatePerMin) {
        this.fillRatePerMin = fillRatePerMin;
        return this;
    }
    public Double getFillRatePerMin() {
        return this.fillRatePerMin;
    }

    public RLProgressBuffer setFinished(Integer finished) {
        this.finished = finished;
        return this;
    }
    public Integer getFinished() {
        return this.finished;
    }

    public RLProgressBuffer setPct(Double pct) {
        this.pct = pct;
        return this;
    }
    public Double getPct() {
        return this.pct;
    }

    public RLProgressBuffer setReady(Integer ready) {
        this.ready = ready;
        return this;
    }
    public Integer getReady() {
        return this.ready;
    }

    public RLProgressBuffer setTarget(Integer target) {
        this.target = target;
        return this;
    }
    public Integer getTarget() {
        return this.target;
    }

    public RLProgressBuffer setTrainBatchSize(Integer trainBatchSize) {
        this.trainBatchSize = trainBatchSize;
        return this;
    }
    public Integer getTrainBatchSize() {
        return this.trainBatchSize;
    }

    public RLProgressBuffer setTraining(Boolean training) {
        this.training = training;
        return this;
    }
    public Boolean getTraining() {
        return this.training;
    }

}
