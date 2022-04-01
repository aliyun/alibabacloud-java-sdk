// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListNodeGroupMetaParam extends TeaModel {
    // componentNames
    @NameInMap("componentNames")
    public java.util.List<String> componentNames;

    // mainVersion
    @NameInMap("mainVersion")
    public String mainVersion;

    public static ListNodeGroupMetaParam build(java.util.Map<String, ?> map) throws Exception {
        ListNodeGroupMetaParam self = new ListNodeGroupMetaParam();
        return TeaModel.build(map, self);
    }

    public ListNodeGroupMetaParam setComponentNames(java.util.List<String> componentNames) {
        this.componentNames = componentNames;
        return this;
    }
    public java.util.List<String> getComponentNames() {
        return this.componentNames;
    }

    public ListNodeGroupMetaParam setMainVersion(String mainVersion) {
        this.mainVersion = mainVersion;
        return this;
    }
    public String getMainVersion() {
        return this.mainVersion;
    }

}
