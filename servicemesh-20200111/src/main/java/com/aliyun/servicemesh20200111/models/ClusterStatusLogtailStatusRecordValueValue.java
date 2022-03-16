// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ClusterStatusLogtailStatusRecordValueValue extends TeaModel {
    @NameInMap("Title")
    public String title;

    @NameInMap("Url")
    public String url;

    public static ClusterStatusLogtailStatusRecordValueValue build(java.util.Map<String, ?> map) throws Exception {
        ClusterStatusLogtailStatusRecordValueValue self = new ClusterStatusLogtailStatusRecordValueValue();
        return TeaModel.build(map, self);
    }

    public ClusterStatusLogtailStatusRecordValueValue setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public ClusterStatusLogtailStatusRecordValueValue setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
