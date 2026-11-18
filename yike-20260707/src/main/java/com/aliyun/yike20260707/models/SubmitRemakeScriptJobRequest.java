// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitRemakeScriptJobRequest extends TeaModel {
    /**
     * <p>The remake parameters in JSON string format. The structure varies depending on the RemakeType. For faithful-remake, the structure is as follows:</p>
     * <ul>
     * <li>ComprehensionResult (String, required): The content understanding result, which is the URL of a JSON file.</li>
     * <li>Product (Object, required): The product information, including the original and new products.<ul>
     * <li>OriginalProductName (String, required): The product or brand name in the original video, used to locate and replace mentions of the original product.</li>
     * <li>NewProduct (Object, required): The new product information.<ul>
     * <li>ProductName (String, required): The product or brand name.</li>
     * <li>Description (String, required): The product description.</li>
     * <li>ProductKnowledge (String, optional): The physical knowledge of the product, such as the material and usage.</li>
     * <li>ProductImages (Array<String>, required): The images of the new product. This array cannot be empty, and each item must be an HTTP or HTTPS URL.</li>
     * <li>SellingPoints (Array<String>, optional): The list of product selling points.</li>
     * <li>OriginalPrice (String, optional): The original price.</li>
     * <li>CurrentPrice (String, optional): The current price.</li>
     * <li>Discount (String, optional): The discount information, such as &quot;50 off for orders over 200&quot; or &quot;buy one get one free&quot;.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>AvatarList (Array<Object>, optional): The list of avatar replacements, supporting single and multiple avatar replacements. We recommend using this field. Pass one item for a single avatar and two to five items for multiple avatars. Each item is an object that describes the replacement relationship between an original avatar and a new avatar:<ul>
     * <li>OriginalAvatarName (String, required for each item): The name of the avatar to be replaced in the original video. Use the avatar name from the video breakdown result to locate the replacement target in the script or video. The original avatar names in the same list cannot be duplicated.</li>
     * <li>NewAvatarImages (Array<String>, required for each item): The list of reference images for the new avatar. This array cannot be empty. Images can be HTTP or HTTPS URLs or registered image MediaIds. Currently, only the first image is used.</li>
     * <li>AvatarName (String, optional for each item): The role name of the replaced avatar in the generated script.</li>
     * </ul>
     * </li>
     * <li>Avatar (Object, optional): The single avatar replacement information compatible with historical calls, retained as a transitional field. We recommend using AvatarList for new integrations and subsequent calls. The field structure is the same as a single item in AvatarList. When using this field, OriginalAvatarName and NewAvatarImages are required, and AvatarName is optional.</li>
     * <li>VoiceoverLanguage (String, optional): The voiceover language. Valid values: zh (Chinese), en (English), es (Spanish), pt (Portuguese), fr (French), de (German), ja (Japanese), ko (Korean), and ar (Arabic). We recommend explicitly specifying this parameter.</li>
     * <li>AdditionalRequirements (String, optional): Additional remake requirements.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;ComprehensionResult&quot;: &quot;<a href="https://example-bucket.oss-cn-shanghai.aliyuncs.com/comprehension-result.json">https://example-bucket.oss-cn-shanghai.aliyuncs.com/comprehension-result.json</a>&quot;,
     *   &quot;Product&quot;: {
     *     &quot;OriginalProductName&quot;: &quot;Original Shapewear Bodysuit&quot;,
     *     &quot;NewProduct&quot;: {
     *       &quot;ProductName&quot;: &quot;Compression Shapewear Bodysuit&quot;,
     *       &quot;Description&quot;: &quot;Description of the new product.&quot;,
     *       &quot;ProductImages&quot;: [
     *         &quot;<a href="https://example.com/product-front.png">https://example.com/product-front.png</a>&quot;,
     *         &quot;<a href="https://example.com/product-side.png">https://example.com/product-side.png</a>&quot;,
     *         &quot;<a href="https://example.com/product-back.png">https://example.com/product-back.png</a>&quot;
     *       ],
     *       &quot;ProductKnowledge&quot;: &quot;Product materials, physical characteristics, and usage instructions.&quot;
     *     }
     *   },
     *   &quot;AvatarList&quot;: [
     *     {
     *       &quot;OriginalAvatarName&quot;: &quot;Original Person A&quot;,
     *       &quot;NewAvatarImages&quot;: [
     *         &quot;<a href="https://example.com/new-avatar-a.png">https://example.com/new-avatar-a.png</a>&quot;
     *       ],
     *       &quot;AvatarName&quot;: &quot;Alice&quot;
     *     },
     *     {
     *       &quot;OriginalAvatarName&quot;: &quot;Original Person B&quot;,
     *       &quot;NewAvatarImages&quot;: [
     *         &quot;<a href="https://example.com/new-avatar-b.png">https://example.com/new-avatar-b.png</a>&quot;
     *       ],
     *       &quot;AvatarName&quot;: &quot;Bob&quot;
     *     }
     *   ],
     *   &quot;VoiceoverLanguage&quot;: &quot;zh&quot;
     * }</p>
     */
    @NameInMap("RemakeParams")
    public String remakeParams;

    /**
     * <p>The remake type, which determines the structure of RemakeParams. Currently, only faithful-remake is supported. This type faithfully remakes the original viral video structure segment by segment, replacing the product and avatar.</p>
     * 
     * <strong>example:</strong>
     * <p>faithful-remake</p>
     */
    @NameInMap("RemakeType")
    public String remakeType;

    /**
     * <p>The custom parameters in JSON string format, which are returned as-is in the callback result, such as newsKey. The system reserves the NotifyAddress field for the callback URL, which is invoked after the task is completed.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;NotifyAddress&quot;: &quot;<a href="https://example.com/callback">https://example.com/callback</a>&quot;
     * }</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitRemakeScriptJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitRemakeScriptJobRequest self = new SubmitRemakeScriptJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitRemakeScriptJobRequest setRemakeParams(String remakeParams) {
        this.remakeParams = remakeParams;
        return this;
    }
    public String getRemakeParams() {
        return this.remakeParams;
    }

    public SubmitRemakeScriptJobRequest setRemakeType(String remakeType) {
        this.remakeType = remakeType;
        return this;
    }
    public String getRemakeType() {
        return this.remakeType;
    }

    public SubmitRemakeScriptJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
