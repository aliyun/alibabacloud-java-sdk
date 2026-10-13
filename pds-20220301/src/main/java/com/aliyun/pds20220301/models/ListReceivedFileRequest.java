// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListReceivedFileRequest extends TeaModel {
    /**
     * <p>The maximum number of items to return. The value cannot exceed 100. If you do not specify this parameter, the default is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The pagination marker from a previous response. The query continues from the position indicated by this marker. If you do not specify this parameter, the query starts from the beginning of the file list.</p>
     * 
     * <strong>example:</strong>
     * <p>eym***</p>
     */
    @NameInMap("marker")
    public String marker;

    public static ListReceivedFileRequest build(java.util.Map<String, ?> map) throws Exception {
        ListReceivedFileRequest self = new ListReceivedFileRequest();
        return TeaModel.build(map, self);
    }

    public ListReceivedFileRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListReceivedFileRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

}
