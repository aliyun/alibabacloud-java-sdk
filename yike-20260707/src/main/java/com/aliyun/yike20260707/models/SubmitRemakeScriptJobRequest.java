// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitRemakeScriptJobRequest extends TeaModel {
    /**
     * <p>The remake parameters. This parameter is a JSON string. The structure varies based on RemakeType. For faithful-remake, the structure is as follows:</p>
     * <ul>
     * <li><p>ComprehensionResult (string, required): The content understanding result. This is the URL of the JSON file.</p>
     * </li>
     * <li><p>Product (object, required): The product information, including the original product and the new product.</p>
     * <ul>
     * <li><p>OriginalProductName (string, required): The product or brand name in the original video to be replaced. This is used to locate and replace mentions of the original product in the script.</p>
     * </li>
     * <li><p>NewProduct (object, required): The new product information. </p>
     * <ul>
     * <li>ProductName (string, required): The product or brand name.</li>
     * <li>Description (string, required): The product description.</li>
     * <li>ProductKnowledge (string, required): The physical knowledge of the product, such as the material and usage instructions.</li>
     * <li>ProductImages (array of strings, required): The images of the new product. This array cannot be empty. Each item must be an HTTP or HTTPS URL.</li>
     * <li>SellingPoints (array of strings, optional): The list of product selling points.</li>
     * <li>OriginalPrice (string, optional): The original price.</li>
     * <li>CurrentPrice (string, optional): The current price.</li>
     * <li>Discount (string, optional): The discount information, such as &quot;50 off for purchases over 200&quot; or &quot;buy one get one free&quot;.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li><p>Avatar (object, required): The avatar information, including the original avatar and the new avatar.</p>
     * <ul>
     * <li>NewAvatarImages (array of strings, required): The list of images for the new avatar. This array cannot be empty. Each item must be a media asset ID or an image URL. If a URL is provided, the system automatically registers it as a media asset. <strong>Currently, only one image is supported</strong> (only the first element of the array is used). The array format is reserved for future extensions.</li>
     * <li>OriginalAvatarName (string, required): The avatar name in the original video to be replaced. This is used to locate and replace the original avatar in the script or video frames.</li>
     * </ul>
     * </li>
     * <li><p>VoiceoverLanguage (string, optional): The voiceover language. Valid values: <code>zh</code> (Chinese), <code>en</code> (English), <code>es</code> (Spanish), <code>pt</code> (Portuguese), <code>fr</code> (French), <code>de</code> (German), <code>ja</code> (Japanese), <code>ko</code> (Korean), and <code>ar</code> (Arabic). Default value: <code>zh</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;ComprehensionResult&quot;: &quot;<a href="http://xxxx.json">http://xxxx.json</a>&quot;,
     *     &quot;Product&quot;:
     *     {
     *         &quot;OriginalProductName&quot;: &quot;xxxx&quot;,
     *         &quot;NewProduct&quot;:
     *         {
     *             &quot;ProductName&quot;: &quot;xxxx&quot;,
     *             &quot;Description&quot;: &quot;xxxx&quot;,
     *             &quot;ProductImages&quot;:
     *             [
     *                 &quot;<a href="https://xxxx.png">https://xxxx.png</a>&quot;,
     *                 &quot;<a href="https://xxxx.png">https://xxxx.png</a>&quot;,
     *                 &quot;<a href="https://xxxx.png">https://xxxx.png</a>&quot;
     *             ],
     *             &quot;ProductKnowledge&quot;: &quot;xxxx&quot;
     *         }
     *     },
     *     &quot;Avatar&quot;:
     *     {
     *         &quot;NewAvatarImages&quot;:
     *         [
     *             &quot;<a href="https://xxxx.png">https://xxxx.png</a>&quot;
     *         ],
     *         &quot;OriginalAvatarName&quot;: &quot;xxxx&quot;
     *     },
     *     &quot;VoiceoverLanguage&quot;: &quot;zh&quot;
     * }</p>
     */
    @NameInMap("RemakeParams")
    public String remakeParams;

    /**
     * <p>The remake type. This parameter determines the structure of RemakeParams. Currently, only faithful-remake is supported. faithful-remake indicates a faithful remake that replicates the original viral structure paragraph by paragraph and replaces the product and avatar.</p>
     * 
     * <strong>example:</strong>
     * <p>faithful-remake</p>
     */
    @NameInMap("RemakeType")
    public String remakeType;

    /**
     * <p>The custom parameters. This parameter is a JSON string and is returned as-is in the callback result, such as newsKey. NotifyAddress is a system-reserved field for the callback URL. The system sends a callback to this URL after the task is completed.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;NotifyAddress&quot;: &quot;<a href="http://xxx.callback.url%22%7D">http://xxx.callback.url&quot;}</a></p>
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
