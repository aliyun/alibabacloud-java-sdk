// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ConfirmLinkefabricFabricSmartdeployconfigsRequest extends TeaModel {
    @NameInMap("Context")
    public String context;

    @NameInMap("AntxConfigsRepeatList")
    public java.util.List<String> antxConfigsRepeatList;

    @NameInMap("DrmConfigsRepeatList")
    public java.util.List<String> drmConfigsRepeatList;

    public static ConfirmLinkefabricFabricSmartdeployconfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmLinkefabricFabricSmartdeployconfigsRequest self = new ConfirmLinkefabricFabricSmartdeployconfigsRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmLinkefabricFabricSmartdeployconfigsRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public ConfirmLinkefabricFabricSmartdeployconfigsRequest setAntxConfigsRepeatList(java.util.List<String> antxConfigsRepeatList) {
        this.antxConfigsRepeatList = antxConfigsRepeatList;
        return this;
    }
    public java.util.List<String> getAntxConfigsRepeatList() {
        return this.antxConfigsRepeatList;
    }

    public ConfirmLinkefabricFabricSmartdeployconfigsRequest setDrmConfigsRepeatList(java.util.List<String> drmConfigsRepeatList) {
        this.drmConfigsRepeatList = drmConfigsRepeatList;
        return this;
    }
    public java.util.List<String> getDrmConfigsRepeatList() {
        return this.drmConfigsRepeatList;
    }

}
