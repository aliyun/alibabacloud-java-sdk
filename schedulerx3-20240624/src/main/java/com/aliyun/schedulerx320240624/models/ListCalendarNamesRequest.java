// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListCalendarNamesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static ListCalendarNamesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCalendarNamesRequest self = new ListCalendarNamesRequest();
        return TeaModel.build(map, self);
    }

    public ListCalendarNamesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
