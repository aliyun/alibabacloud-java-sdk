// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateAIStaffConversationRequest extends TeaModel {
    /**
     * <p>The text of the user question. The first 100 characters are truncated and used as the session title.</p>
     * 
     * <strong>example:</strong>
     * <p>Bathroom hardware products, featuring a brushed stainless steel surface with a modern silver-gray color tone, presenting a minimalist and textured style. The products include showerheads, faucets, and towel racks, all of which are rust-proof and corrosion-resistant, making them suitable for humid environments. The connections between components are precisely designed with hidden screw structures to enhance overall aesthetics. The faucets and showerheads support multiple water flow modes, and the handles operate smoothly, conforming to ergonomic design. All hardware components have passed the national water-saving certification, support cold and hot water connections, and are wall-mounted</p>
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
