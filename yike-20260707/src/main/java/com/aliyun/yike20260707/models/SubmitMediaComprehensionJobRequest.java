// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitMediaComprehensionJobRequest extends TeaModel {
    /**
     * <p>The input media. The value is a JSON string with the following structure:</p>
     * <ul>
     * <li>Medias (Array<Object>, required): The list of media files. The array must contain 1 to 10 elements. Each element contains the following fields:<ul>
     * <li>Type (String, required): The media type. Valid values: video and image. The value is not case-sensitive.</li>
     * <li>Url (String, mutually exclusive with MediaId): The URL of the media file. The URL must start with http:// or https:// and be up to 2,048 characters in length. Unregistered URLs are automatically registered as media files.</li>
     * <li>MediaId (String, mutually exclusive with Url): The ID of the registered media file. If both Url and MediaId are specified, MediaId takes precedence.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;Medias&quot;: [
     *     {
     *       &quot;Type&quot;: &quot;video&quot;,
     *       &quot;Url&quot;: &quot;<a href="https://example.com/source.mp4">https://example.com/source.mp4</a>&quot;
     *     }
     *   ]
     * }</p>
     */
    @NameInMap("Input")
    public String input;

    /**
     * <p>The analysis parameters. The value is a JSON string up to 65,536 characters in length.</p>
     * <ul>
     * <li>VideoBreakdown: Supports the ResultType parameter (String, optional). Valid value: Standard (default).</li>
     * <li>ProductRecognition: Uses parameters such as product information and prompts. The total number of fields cannot exceed 20. Example fields for product parameters include ProductName, BrandName, and SellingPoints.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;ResultType&quot;: &quot;Standard&quot;
     * }
     * or
     * {
     *   &quot;ProductName&quot;: &quot;Quiet Blender Soymilk Maker&quot;,
     *   &quot;BrandName&quot;: &quot;LiangChu&quot;,
     *   &quot;SellingPoints&quot;: [
     *     &quot;Low-noise blending&quot;,
     *     &quot;One-touch self-cleaning&quot;
     *   ]
     * }</p>
     */
    @NameInMap("JobParams")
    public String jobParams;

    /**
     * <p>The job type. Valid values:</p>
     * <ul>
     * <li>VideoBreakdown: Viral video breakdown. The Medias array must contain exactly one element with Type set to video.</li>
     * <li>ProductRecognition: Product image information recognition. All elements in the Medias array must have Type set to image.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VideoBreakdown</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The custom parameters. The value is a JSON string. The custom parameters are returned as-is in the callback result (for example, newsKey). NotifyAddress is a system-reserved field for the callback URL. A callback is triggered after the job is completed.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;NotifyAddress&quot;: &quot;<a href="https://example.com/callback">https://example.com/callback</a>&quot;
     * }</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitMediaComprehensionJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaComprehensionJobRequest self = new SubmitMediaComprehensionJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitMediaComprehensionJobRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitMediaComprehensionJobRequest setJobParams(String jobParams) {
        this.jobParams = jobParams;
        return this;
    }
    public String getJobParams() {
        return this.jobParams;
    }

    public SubmitMediaComprehensionJobRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public SubmitMediaComprehensionJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
