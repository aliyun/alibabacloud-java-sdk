// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MobiInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>commit_pckesd7d_20230227215101</p>
     */
    @NameInMap("mobiCommitId")
    public String mobiCommitId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("mobiId")
    public Long mobiId;

    /**
     * <strong>example:</strong>
     * <p>module_tvtpydeq</p>
     */
    @NameInMap("mobiModuleId")
    public String mobiModuleId;

    /**
     * <strong>example:</strong>
     * <p>sda</p>
     */
    @NameInMap("storeUrl")
    public String storeUrl;

    public static MobiInfo build(java.util.Map<String, ?> map) throws Exception {
        MobiInfo self = new MobiInfo();
        return TeaModel.build(map, self);
    }

    public MobiInfo setMobiCommitId(String mobiCommitId) {
        this.mobiCommitId = mobiCommitId;
        return this;
    }
    public String getMobiCommitId() {
        return this.mobiCommitId;
    }

    public MobiInfo setMobiId(Long mobiId) {
        this.mobiId = mobiId;
        return this;
    }
    public Long getMobiId() {
        return this.mobiId;
    }

    public MobiInfo setMobiModuleId(String mobiModuleId) {
        this.mobiModuleId = mobiModuleId;
        return this;
    }
    public String getMobiModuleId() {
        return this.mobiModuleId;
    }

    public MobiInfo setStoreUrl(String storeUrl) {
        this.storeUrl = storeUrl;
        return this;
    }
    public String getStoreUrl() {
        return this.storeUrl;
    }

}
