// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetListRecordRequest extends TeaModel {
    /**
     * <p>The ID of the analysis record to query the status of.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxxxxx-f37b-478d-87f6-2259ed8766bf</p>
     */
    @NameInMap("analysisId")
    public String analysisId;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("current")
    public Long current;

    @NameInMap("customId")
    public Long customId;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("region")
    public String region;

    public static GetListRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        GetListRecordRequest self = new GetListRecordRequest();
        return TeaModel.build(map, self);
    }

    public GetListRecordRequest setAnalysisId(String analysisId) {
        this.analysisId = analysisId;
        return this;
    }
    public String getAnalysisId() {
        return this.analysisId;
    }

    public GetListRecordRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public GetListRecordRequest setCustomId(Long customId) {
        this.customId = customId;
        return this;
    }
    public Long getCustomId() {
        return this.customId;
    }

    public GetListRecordRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetListRecordRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
