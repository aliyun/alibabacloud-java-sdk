// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateMonitorRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("DeviceOperateType")
    public String deviceOperateType;

    @NameInMap("DeviceList")
    public String deviceList;

    @NameInMap("PicOperateType")
    public String picOperateType;

    @NameInMap("PicList")
    public String picList;

    @NameInMap("AttributeOperateType")
    public String attributeOperateType;

    @NameInMap("AttributeName")
    public String attributeName;

    @NameInMap("AttributeValueList")
    public String attributeValueList;

    @NameInMap("Description")
    public String description;

    @NameInMap("RuleExpression")
    public String ruleExpression;

    public static UpdateMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMonitorRequest self = new UpdateMonitorRequest();
        return TeaModel.build(map, self);
    }

}
