// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class StreamingResourceSetting extends TeaModel {
    @NameInMap("basicResourceSetting")
    public BasicResourceSetting basicResourceSetting;

    @NameInMap("expertResourceSetting")
    public ExpertResourceSetting expertResourceSetting;

    @NameInMap("resourceSettingMode")
    public String resourceSettingMode;

    public static StreamingResourceSetting build(java.util.Map<String, ?> map) throws Exception {
        StreamingResourceSetting self = new StreamingResourceSetting();
        return TeaModel.build(map, self);
    }

    public StreamingResourceSetting setBasicResourceSetting(BasicResourceSetting basicResourceSetting) {
        this.basicResourceSetting = basicResourceSetting;
        return this;
    }
    public BasicResourceSetting getBasicResourceSetting() {
        return this.basicResourceSetting;
    }

    public StreamingResourceSetting setExpertResourceSetting(ExpertResourceSetting expertResourceSetting) {
        this.expertResourceSetting = expertResourceSetting;
        return this;
    }
    public ExpertResourceSetting getExpertResourceSetting() {
        return this.expertResourceSetting;
    }

    public StreamingResourceSetting setResourceSettingMode(String resourceSettingMode) {
        this.resourceSettingMode = resourceSettingMode;
        return this;
    }
    public String getResourceSettingMode() {
        return this.resourceSettingMode;
    }

}
