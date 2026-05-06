// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateTaskGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegId")
    public String regId;

    /**
     * <strong>example:</strong>
     * <p>1,2</p>
     */
    @NameInMap("SampleIds")
    public String sampleIds;

    /**
     * <strong>example:</strong>
     * <p>[\&quot;porn\&quot;,\&quot;terrorism\&quot;,\&quot;ad\&quot;]</p>
     */
    @NameInMap("Scenes")
    public String scenes;

    /**
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("ServiceCodes")
    public String serviceCodes;

    /**
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("ServiceNames")
    public String serviceNames;

    /**
     * <strong>example:</strong>
     * <p>INTERNET</p>
     */
    @NameInMap("Tab")
    public String tab;

    /**
     * <strong>example:</strong>
     * <p>TeskGroupTest</p>
     */
    @NameInMap("TaskGroupName")
    public String taskGroupName;

    /**
     * <strong>example:</strong>
     * <p>SAF_CONSOLE</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateTaskGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskGroupRequest self = new CreateTaskGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateTaskGroupRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateTaskGroupRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CreateTaskGroupRequest setSampleIds(String sampleIds) {
        this.sampleIds = sampleIds;
        return this;
    }
    public String getSampleIds() {
        return this.sampleIds;
    }

    public CreateTaskGroupRequest setScenes(String scenes) {
        this.scenes = scenes;
        return this;
    }
    public String getScenes() {
        return this.scenes;
    }

    public CreateTaskGroupRequest setServiceCodes(String serviceCodes) {
        this.serviceCodes = serviceCodes;
        return this;
    }
    public String getServiceCodes() {
        return this.serviceCodes;
    }

    public CreateTaskGroupRequest setServiceNames(String serviceNames) {
        this.serviceNames = serviceNames;
        return this;
    }
    public String getServiceNames() {
        return this.serviceNames;
    }

    public CreateTaskGroupRequest setTab(String tab) {
        this.tab = tab;
        return this;
    }
    public String getTab() {
        return this.tab;
    }

    public CreateTaskGroupRequest setTaskGroupName(String taskGroupName) {
        this.taskGroupName = taskGroupName;
        return this;
    }
    public String getTaskGroupName() {
        return this.taskGroupName;
    }

    public CreateTaskGroupRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
