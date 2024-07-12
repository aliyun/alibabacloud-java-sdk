// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetProjectFeatureEntityHotIdsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("HotIds")
    public String hotIds;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("NextSeqNumber")
    public String nextSeqNumber;

    /**
     * <strong>example:</strong>
     * <p>FFD39C0F-DD8D-51B2-864E-2842206DB0E8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetProjectFeatureEntityHotIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectFeatureEntityHotIdsResponseBody self = new GetProjectFeatureEntityHotIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectFeatureEntityHotIdsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public GetProjectFeatureEntityHotIdsResponseBody setHotIds(String hotIds) {
        this.hotIds = hotIds;
        return this;
    }
    public String getHotIds() {
        return this.hotIds;
    }

    public GetProjectFeatureEntityHotIdsResponseBody setNextSeqNumber(String nextSeqNumber) {
        this.nextSeqNumber = nextSeqNumber;
        return this;
    }
    public String getNextSeqNumber() {
        return this.nextSeqNumber;
    }

    public GetProjectFeatureEntityHotIdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
