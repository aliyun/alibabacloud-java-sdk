// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateAIStaffConversationRequest extends TeaModel {
    /**
     * <p>The user question text. The first 100 characters are truncated as the session title.</p>
     * 
     * <strong>example:</strong>
     * <p>卫浴五金产品，表面采用拉丝不锈钢材质，整体色调为现代银灰色，呈现简约且富有质感的风格。产品包括淋浴花洒、水龙头及毛巾架等配件，均具备防锈、耐腐蚀性能，适用于潮湿环境。各部件连接处设计精密，配有隐藏式螺丝结构，提升整体美观度。水龙头和花洒喷头支持多模式出水，把手操作顺滑，符合人体工学设计。所有五金件通过国家节水认证，支持冷热水接入，安装方式为壁挂式。</p>
     */
    @NameInMap("Text")
    public String text;

    public static CreateAIStaffConversationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAIStaffConversationRequest self = new CreateAIStaffConversationRequest();
        return TeaModel.build(map, self);
    }

    public CreateAIStaffConversationRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
