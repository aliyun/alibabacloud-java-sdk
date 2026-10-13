// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetAnnotationMissionTagInfoListRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>If this parameter is not specified, the default tags of the tenant are returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4eee9bf8-1319-468f-ac82-83c50ae389f8</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetAnnotationMissionTagInfoListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAnnotationMissionTagInfoListRequest self = new GetAnnotationMissionTagInfoListRequest();
        return TeaModel.build(map, self);
    }

    public GetAnnotationMissionTagInfoListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAnnotationMissionTagInfoListRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetAnnotationMissionTagInfoListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
