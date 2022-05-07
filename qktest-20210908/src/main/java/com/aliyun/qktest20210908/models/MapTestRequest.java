// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qktest20210908.models;

import com.aliyun.tea.*;

public class MapTestRequest extends TeaModel {
    @NameInMap("Map")
    public java.util.Map<String, String> map;

    public static MapTestRequest build(java.util.Map<String, ?> map) throws Exception {
        MapTestRequest self = new MapTestRequest();
        return TeaModel.build(map, self);
    }

    public MapTestRequest setMap(java.util.Map<String, String> map) {
        this.map = map;
        return this;
    }
    public java.util.Map<String, String> getMap() {
        return this.map;
    }

}
