// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420;

import com.aliyun.tea.*;
import com.aliyun.wyota20210420.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("wyota", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    /**
     * <b>summary</b> : 
     * <p>设备激活</p>
     * 
     * @param request ActivateDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ActivateDeviceResponse
     */
    public ActivateDeviceResponse activateDeviceWithOptions(ActivateDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActivateDevice"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActivateDeviceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设备激活</p>
     * 
     * @param request ActivateDeviceRequest
     * @return ActivateDeviceResponse
     */
    public ActivateDeviceResponse activateDevice(ActivateDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.activateDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过序列号添加设备</p>
     * 
     * @param request AddDeviceFromSNRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDeviceFromSNResponse
     */
    public AddDeviceFromSNResponse addDeviceFromSNWithOptions(AddDeviceFromSNRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alias)) {
            body.put("Alias", request.alias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customProperty)) {
            body.put("CustomProperty", request.customProperty);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelContents)) {
            body.put("LabelContents", request.labelContents);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secureNetworkType)) {
            body.put("SecureNetworkType", request.secureNetworkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNo)) {
            body.put("SerialNo", request.serialNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDeviceFromSN"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDeviceFromSNResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通过序列号添加设备</p>
     * 
     * @param request AddDeviceFromSNRequest
     * @return AddDeviceFromSNResponse
     */
    public AddDeviceFromSNResponse addDeviceFromSN(AddDeviceFromSNRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDeviceFromSNWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增设备座位和标签</p>
     * 
     * @param request AddDeviceSeatsAndLabelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDeviceSeatsAndLabelsResponse
     */
    public AddDeviceSeatsAndLabelsResponse addDeviceSeatsAndLabelsWithOptions(AddDeviceSeatsAndLabelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isUnique)) {
            body.put("IsUnique", request.isUnique);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.label)) {
            body.put("Label", request.label);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelList)) {
            body.put("LabelList", request.labelList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seatName)) {
            body.put("SeatName", request.seatName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNo)) {
            body.put("SerialNo", request.serialNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            body.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDeviceSeatsAndLabels"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDeviceSeatsAndLabelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新增设备座位和标签</p>
     * 
     * @param request AddDeviceSeatsAndLabelsRequest
     * @return AddDeviceSeatsAndLabelsResponse
     */
    public AddDeviceSeatsAndLabelsResponse addDeviceSeatsAndLabels(AddDeviceSeatsAndLabelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDeviceSeatsAndLabelsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过CSV文件添加设备</p>
     * 
     * @param request AddDevicesFromCSVRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDevicesFromCSVResponse
     */
    public AddDevicesFromCSVResponse addDevicesFromCSVWithOptions(AddDevicesFromCSVRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            body.put("FileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seatCol)) {
            body.put("SeatCol", request.seatCol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            body.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteName)) {
            body.put("SiteName", request.siteName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDevicesFromCSV"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDevicesFromCSVResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通过CSV文件添加设备</p>
     * 
     * @param request AddDevicesFromCSVRequest
     * @return AddDevicesFromCSVResponse
     */
    public AddDevicesFromCSVResponse addDevicesFromCSV(AddDevicesFromCSVRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDevicesFromCSVWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加标签</p>
     * 
     * @param request AddLabelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddLabelsResponse
     */
    public AddLabelsResponse addLabelsWithOptions(AddLabelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labelContents)) {
            body.put("LabelContents", request.labelContents);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddLabels"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddLabelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加标签</p>
     * 
     * @param request AddLabelsRequest
     * @return AddLabelsResponse
     */
    public AddLabelsResponse addLabels(AddLabelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addLabelsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增或更新设备工位</p>
     * 
     * @param request AddOrUpdateDeviceSeatsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddOrUpdateDeviceSeatsResponse
     */
    public AddOrUpdateDeviceSeatsResponse addOrUpdateDeviceSeatsWithOptions(AddOrUpdateDeviceSeatsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCustomId)) {
            body.put("UserCustomId", request.userCustomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            body.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddOrUpdateDeviceSeats"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddOrUpdateDeviceSeatsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新增或更新设备工位</p>
     * 
     * @param request AddOrUpdateDeviceSeatsRequest
     * @return AddOrUpdateDeviceSeatsResponse
     */
    public AddOrUpdateDeviceSeatsResponse addOrUpdateDeviceSeats(AddOrUpdateDeviceSeatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addOrUpdateDeviceSeatsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加终端</p>
     * 
     * @param request AddTerminalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddTerminalResponse
     */
    public AddTerminalResponse addTerminalWithOptions(AddTerminalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alias)) {
            body.put("Alias", request.alias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            body.put("SerialNumber", request.serialNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terminalGroupId)) {
            body.put("TerminalGroupId", request.terminalGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddTerminal"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddTerminalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加终端</p>
     * 
     * @param request AddTerminalRequest
     * @return AddTerminalResponse
     */
    public AddTerminalResponse addTerminal(AddTerminalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addTerminalWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设备绑定终端用户</p>
     * 
     * @param request AttachEndUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachEndUsersResponse
     */
    public AttachEndUsersResponse attachEndUsersWithOptions(AttachEndUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endUserIds)) {
            body.put("EndUserIds", request.endUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNo)) {
            body.put("SerialNo", request.serialNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachEndUsers"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachEndUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设备绑定终端用户</p>
     * 
     * @param request AttachEndUsersRequest
     * @return AttachEndUsersResponse
     */
    public AttachEndUsersResponse attachEndUsers(AttachEndUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachEndUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设备绑定标签</p>
     * 
     * @param request AttachLabelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachLabelResponse
     */
    public AttachLabelResponse attachLabelWithOptions(AttachLabelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labelContent)) {
            body.put("LabelContent", request.labelContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelId)) {
            body.put("LabelId", request.labelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNo)) {
            body.put("SerialNo", request.serialNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachLabel"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachLabelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设备绑定标签</p>
     * 
     * @param request AttachLabelRequest
     * @return AttachLabelResponse
     */
    public AttachLabelResponse attachLabel(AttachLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachLabelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量绑定标签</p>
     * 
     * @param request AttachLabelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachLabelsResponse
     */
    public AttachLabelsResponse attachLabelsWithOptions(AttachLabelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labelIds)) {
            body.put("LabelIds", request.labelIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNo)) {
            body.put("SerialNo", request.serialNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNoList)) {
            body.put("SerialNoList", request.serialNoList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachLabels"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachLabelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量绑定标签</p>
     * 
     * @param request AttachLabelsRequest
     * @return AttachLabelsResponse
     */
    public AttachLabelsResponse attachLabels(AttachLabelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachLabelsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>绑定免账号登录用户</p>
     * 
     * @param request BindAccountLessLoginUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindAccountLessLoginUserResponse
     */
    public BindAccountLessLoginUserResponse bindAccountLessLoginUserWithOptions(BindAccountLessLoginUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            body.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            body.put("SerialNumber", request.serialNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindAccountLessLoginUser"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindAccountLessLoginUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>绑定免账号登录用户</p>
     * 
     * @param request BindAccountLessLoginUserRequest
     * @return BindAccountLessLoginUserResponse
     */
    public BindAccountLessLoginUserResponse bindAccountLessLoginUser(BindAccountLessLoginUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindAccountLessLoginUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>绑定免账号登录用户</p>
     * 
     * @param request BindPasswordFreeLoginUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindPasswordFreeLoginUserResponse
     */
    public BindPasswordFreeLoginUserResponse bindPasswordFreeLoginUserWithOptions(BindPasswordFreeLoginUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            body.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            body.put("SerialNumber", request.serialNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindPasswordFreeLoginUser"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindPasswordFreeLoginUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>绑定免账号登录用户</p>
     * 
     * @param request BindPasswordFreeLoginUserRequest
     * @return BindPasswordFreeLoginUserResponse
     */
    public BindPasswordFreeLoginUserResponse bindPasswordFreeLoginUser(BindPasswordFreeLoginUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindPasswordFreeLoginUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>检查uuid有效性</p>
     * 
     * @param request CheckUuidValidRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckUuidValidResponse
     */
    public CheckUuidValidResponse checkUuidValidWithOptions(CheckUuidValidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bluetooth)) {
            body.put("Bluetooth", request.bluetooth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buildId)) {
            body.put("BuildId", request.buildId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chipId)) {
            body.put("ChipId", request.chipId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customId)) {
            body.put("CustomId", request.customId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.etherMac)) {
            body.put("EtherMac", request.etherMac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNo)) {
            body.put("SerialNo", request.serialNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wlan)) {
            body.put("Wlan", request.wlan);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckUuidValid"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckUuidValidResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>检查uuid有效性</p>
     * 
     * @param request CheckUuidValidRequest
     * @return CheckUuidValidResponse
     */
    public CheckUuidValidResponse checkUuidValid(CheckUuidValidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkUuidValidWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建任务</p>
     * 
     * @param request CreateAppOtaTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppOtaTaskResponse
     */
    public CreateAppOtaTaskResponse createAppOtaTaskWithOptions(CreateAppOtaTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appVersionUid)) {
            query.put("AppVersionUid", request.appVersionUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            query.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIdList)) {
            query.put("ClientIdList", request.clientIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            query.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creator)) {
            query.put("Creator", request.creator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceUpgrade)) {
            query.put("ForceUpgrade", request.forceUpgrade);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.label)) {
            query.put("Label", request.label);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regions)) {
            query.put("Regions", request.regions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppOtaTask"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppOtaTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建任务</p>
     * 
     * @param request CreateAppOtaTaskRequest
     * @return CreateAppOtaTaskResponse
     */
    public CreateAppOtaTaskResponse createAppOtaTask(CreateAppOtaTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppOtaTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建版本</p>
     * 
     * @param request CreateAppOtaVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppOtaVersionResponse
     */
    public CreateAppOtaVersionResponse createAppOtaVersionWithOptions(CreateAppOtaVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appVersion)) {
            query.put("AppVersion", request.appVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.arch)) {
            query.put("Arch", request.arch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            query.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            query.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creator)) {
            query.put("Creator", request.creator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.downloadUrl)) {
            query.put("DownloadUrl", request.downloadUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.md5)) {
            query.put("Md5", request.md5);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.os)) {
            query.put("Os", request.os);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            query.put("OsType", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otaType)) {
            query.put("OtaType", request.otaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseNote)) {
            query.put("ReleaseNote", request.releaseNote);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseNoteEn)) {
            query.put("ReleaseNoteEn", request.releaseNoteEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseNoteJp)) {
            query.put("ReleaseNoteJp", request.releaseNoteJp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotRegionId)) {
            query.put("SnapshotRegionId", request.snapshotRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionType)) {
            query.put("VersionType", request.versionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppOtaVersion"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppOtaVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建版本</p>
     * 
     * @param request CreateAppOtaVersionRequest
     * @return CreateAppOtaVersionResponse
     */
    public CreateAppOtaVersionResponse createAppOtaVersion(CreateAppOtaVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppOtaVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除版本</p>
     * 
     * @param request DeleteAppOtaVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppOtaVersionsResponse
     */
    public DeleteAppOtaVersionsResponse deleteAppOtaVersionsWithOptions(DeleteAppOtaVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.versionUidList)) {
            query.put("VersionUidList", request.versionUidList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppOtaVersions"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppOtaVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除版本</p>
     * 
     * @param request DeleteAppOtaVersionsRequest
     * @return DeleteAppOtaVersionsResponse
     */
    public DeleteAppOtaVersionsResponse deleteAppOtaVersions(DeleteAppOtaVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppOtaVersionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除设备</p>
     * 
     * @param request DeleteDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDevicesResponse
     */
    public DeleteDevicesResponse deleteDevicesWithOptions(DeleteDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.uuids)) {
            query.put("Uuids", request.uuids);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            body.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNos)) {
            body.put("SerialNos", request.serialNos);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDevices"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDevicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除设备</p>
     * 
     * @param request DeleteDevicesRequest
     * @return DeleteDevicesResponse
     */
    public DeleteDevicesResponse deleteDevices(DeleteDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDevicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除标签</p>
     * 
     * @param request DeleteLabelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLabelResponse
     */
    public DeleteLabelResponse deleteLabelWithOptions(DeleteLabelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            body.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelContent)) {
            body.put("LabelContent", request.labelContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelId)) {
            body.put("LabelId", request.labelId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLabel"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLabelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除标签</p>
     * 
     * @param request DeleteLabelRequest
     * @return DeleteLabelResponse
     */
    public DeleteLabelResponse deleteLabel(DeleteLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLabelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询版本</p>
     * 
     * @param request DescribeAppOtaVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppOtaVersionResponse
     */
    public DescribeAppOtaVersionResponse describeAppOtaVersionWithOptions(DescribeAppOtaVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appVersion)) {
            query.put("AppVersion", request.appVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            query.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            query.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creator)) {
            query.put("Creator", request.creator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionUid)) {
            query.put("VersionUid", request.versionUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppOtaVersion"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppOtaVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询版本</p>
     * 
     * @param request DescribeAppOtaVersionRequest
     * @return DescribeAppOtaVersionResponse
     */
    public DescribeAppOtaVersionResponse describeAppOtaVersion(DescribeAppOtaVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppOtaVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询设备座位</p>
     * 
     * @param request DescribeDeviceSeatsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDeviceSeatsResponse
     */
    public DescribeDeviceSeatsResponse describeDeviceSeatsWithOptions(DescribeDeviceSeatsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNo)) {
            body.put("SerialNo", request.serialNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNoList)) {
            body.put("SerialNoList", request.serialNoList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            body.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDeviceSeats"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDeviceSeatsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询设备座位</p>
     * 
     * @param request DescribeDeviceSeatsRequest
     * @return DescribeDeviceSeatsResponse
     */
    public DescribeDeviceSeatsResponse describeDeviceSeats(DescribeDeviceSeatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeviceSeatsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询版本信息</p>
     * 
     * @param request DescribeDeviceVersionDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDeviceVersionDetailResponse
     */
    public DescribeDeviceVersionDetailResponse describeDeviceVersionDetailWithOptions(DescribeDeviceVersionDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            body.put("NetworkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionName)) {
            body.put("VersionName", request.versionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDeviceVersionDetail"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDeviceVersionDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询版本信息</p>
     * 
     * @param request DescribeDeviceVersionDetailRequest
     * @return DescribeDeviceVersionDetailResponse
     */
    public DescribeDeviceVersionDetailResponse describeDeviceVersionDetail(DescribeDeviceVersionDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeviceVersionDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询设备标签数量</p>
     * 
     * @param request DescribeSnLabelCountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSnLabelCountsResponse
     */
    public DescribeSnLabelCountsResponse describeSnLabelCountsWithOptions(DescribeSnLabelCountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labelList)) {
            body.put("LabelList", request.labelList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            body.put("ZoneId", request.zoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneName)) {
            body.put("ZoneName", request.zoneName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSnLabelCounts"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSnLabelCountsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询设备标签数量</p>
     * 
     * @param request DescribeSnLabelCountsRequest
     * @return DescribeSnLabelCountsResponse
     */
    public DescribeSnLabelCountsResponse describeSnLabelCounts(DescribeSnLabelCountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSnLabelCountsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询工作区域</p>
     * 
     * @param request DescribeWorkZonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWorkZonesResponse
     */
    public DescribeWorkZonesResponse describeWorkZonesWithOptions(DescribeWorkZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneIdList)) {
            body.put("ZoneIdList", request.zoneIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneNameList)) {
            body.put("ZoneNameList", request.zoneNameList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWorkZones"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWorkZonesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询工作区域</p>
     * 
     * @param request DescribeWorkZonesRequest
     * @return DescribeWorkZonesResponse
     */
    public DescribeWorkZonesResponse describeWorkZones(DescribeWorkZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWorkZonesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设备解绑终端用户</p>
     * 
     * @param request DetachEndUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachEndUsersResponse
     */
    public DetachEndUsersResponse detachEndUsersWithOptions(DetachEndUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endUserIds)) {
            body.put("EndUserIds", request.endUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNo)) {
            body.put("SerialNo", request.serialNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachEndUsers"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachEndUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设备解绑终端用户</p>
     * 
     * @param request DetachEndUsersRequest
     * @return DetachEndUsersResponse
     */
    public DetachEndUsersResponse detachEndUsers(DetachEndUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachEndUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设备绑定标签</p>
     * 
     * @param request DetachLabelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachLabelResponse
     */
    public DetachLabelResponse detachLabelWithOptions(DetachLabelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labelContent)) {
            body.put("LabelContent", request.labelContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelId)) {
            body.put("LabelId", request.labelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNo)) {
            body.put("SerialNo", request.serialNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachLabel"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachLabelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设备绑定标签</p>
     * 
     * @param request DetachLabelRequest
     * @return DetachLabelResponse
     */
    public DetachLabelResponse detachLabel(DetachLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachLabelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量解绑标签</p>
     * 
     * @param request DetachLabelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachLabelsResponse
     */
    public DetachLabelsResponse detachLabelsWithOptions(DetachLabelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labelIds)) {
            body.put("LabelIds", request.labelIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNo)) {
            body.put("SerialNo", request.serialNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNoList)) {
            body.put("SerialNoList", request.serialNoList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachLabels"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachLabelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量解绑标签</p>
     * 
     * @param request DetachLabelsRequest
     * @return DetachLabelsResponse
     */
    public DetachLabelsResponse detachLabels(DetachLabelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachLabelsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户上传的文件</p>
     * 
     * @param request GenerateOssUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateOssUrlResponse
     */
    public GenerateOssUrlResponse generateOssUrlWithOptions(GenerateOssUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.objectNameList)) {
            body.put("ObjectNameList", request.objectNameList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateOssUrl"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateOssUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户上传的文件</p>
     * 
     * @param request GenerateOssUrlRequest
     * @return GenerateOssUrlResponse
     */
    public GenerateOssUrlResponse generateOssUrl(GenerateOssUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateOssUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取应用最新版本</p>
     * 
     * @param request GetAppOtaLatestVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppOtaLatestVersionResponse
     */
    public GetAppOtaLatestVersionResponse getAppOtaLatestVersionWithOptions(GetAppOtaLatestVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseVersion)) {
            query.put("BaseVersion", request.baseVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            query.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientUid)) {
            query.put("ClientUid", request.clientUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            query.put("OsType", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppOtaLatestVersion"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppOtaLatestVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取应用最新版本</p>
     * 
     * @param request GetAppOtaLatestVersionRequest
     * @return GetAppOtaLatestVersionResponse
     */
    public GetAppOtaLatestVersionResponse getAppOtaLatestVersion(GetAppOtaLatestVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppOtaLatestVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取设备配置</p>
     * 
     * @param request GetDeviceConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeviceConfigsResponse
     */
    public GetDeviceConfigsResponse getDeviceConfigsWithOptions(GetDeviceConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            body.put("NetworkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNo)) {
            body.put("SerialNo", request.serialNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.urclVersion)) {
            body.put("UrclVersion", request.urclVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCustomId)) {
            body.put("UserCustomId", request.userCustomId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceConfigs"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取设备配置</p>
     * 
     * @param request GetDeviceConfigsRequest
     * @return GetDeviceConfigsResponse
     */
    public GetDeviceConfigsResponse getDeviceConfigs(GetDeviceConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeviceConfigsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取是否开启自动升级状态</p>
     * 
     * @param request GetDeviceOtaAutoStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeviceOtaAutoStatusResponse
     */
    public GetDeviceOtaAutoStatusResponse getDeviceOtaAutoStatusWithOptions(GetDeviceOtaAutoStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            body.put("ClientType", request.clientType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceOtaAutoStatus"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceOtaAutoStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取是否开启自动升级状态</p>
     * 
     * @param request GetDeviceOtaAutoStatusRequest
     * @return GetDeviceOtaAutoStatusResponse
     */
    public GetDeviceOtaAutoStatusResponse getDeviceOtaAutoStatus(GetDeviceOtaAutoStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeviceOtaAutoStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取设备升级信息</p>
     * 
     * @param request GetDeviceOtaInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeviceOtaInfoResponse
     */
    public GetDeviceOtaInfoResponse getDeviceOtaInfoWithOptions(GetDeviceOtaInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseVersion)) {
            body.put("BaseVersion", request.baseVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            body.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            body.put("NetworkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osVersion)) {
            body.put("OsVersion", request.osVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetVersionType)) {
            body.put("TargetVersionType", request.targetVersionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceOtaInfo"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceOtaInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取设备升级信息</p>
     * 
     * @param request GetDeviceOtaInfoRequest
     * @return GetDeviceOtaInfoResponse
     */
    public GetDeviceOtaInfoResponse getDeviceOtaInfo(GetDeviceOtaInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeviceOtaInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取设备升级信息</p>
     * 
     * @param request GetDeviceOtaInfoTestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeviceOtaInfoTestResponse
     */
    public GetDeviceOtaInfoTestResponse getDeviceOtaInfoTestWithOptions(GetDeviceOtaInfoTestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseVersion)) {
            body.put("BaseVersion", request.baseVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceOtaInfoTest"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceOtaInfoTestResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取设备升级信息</p>
     * 
     * @param request GetDeviceOtaInfoTestRequest
     * @return GetDeviceOtaInfoTestResponse
     */
    public GetDeviceOtaInfoTestResponse getDeviceOtaInfoTest(GetDeviceOtaInfoTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeviceOtaInfoTestWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取租户任务版本信息</p>
     * 
     * @param request GetDeviceOtaTaskVersionInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeviceOtaTaskVersionInfoResponse
     */
    public GetDeviceOtaTaskVersionInfoResponse getDeviceOtaTaskVersionInfoWithOptions(GetDeviceOtaTaskVersionInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceOtaTaskVersionInfo"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceOtaTaskVersionInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取租户任务版本信息</p>
     * 
     * @param request GetDeviceOtaTaskVersionInfoRequest
     * @return GetDeviceOtaTaskVersionInfoResponse
     */
    public GetDeviceOtaTaskVersionInfoResponse getDeviceOtaTaskVersionInfo(GetDeviceOtaTaskVersionInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeviceOtaTaskVersionInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获得设备升级详情</p>
     * 
     * @param request GetDeviceUpgradeStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeviceUpgradeStatusResponse
     */
    public GetDeviceUpgradeStatusResponse getDeviceUpgradeStatusWithOptions(GetDeviceUpgradeStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appVersion)) {
            query.put("AppVersion", request.appVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientUid)) {
            query.put("ClientUid", request.clientUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskUid)) {
            query.put("TaskUid", request.taskUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceUpgradeStatus"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceUpgradeStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获得设备升级详情</p>
     * 
     * @param request GetDeviceUpgradeStatusRequest
     * @return GetDeviceUpgradeStatusResponse
     */
    public GetDeviceUpgradeStatusResponse getDeviceUpgradeStatus(GetDeviceUpgradeStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeviceUpgradeStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>导出设备工位列表</p>
     * 
     * @param request GetExportDeviceInfoOssUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExportDeviceInfoOssUrlResponse
     */
    public GetExportDeviceInfoOssUrlResponse getExportDeviceInfoOssUrlWithOptions(GetExportDeviceInfoOssUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            body.put("ZoneId", request.zoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneName)) {
            body.put("ZoneName", request.zoneName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExportDeviceInfoOssUrl"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExportDeviceInfoOssUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>导出设备工位列表</p>
     * 
     * @param request GetExportDeviceInfoOssUrlRequest
     * @return GetExportDeviceInfoOssUrlResponse
     */
    public GetExportDeviceInfoOssUrlResponse getExportDeviceInfoOssUrl(GetExportDeviceInfoOssUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getExportDeviceInfoOssUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询OSS配置信息</p>
     * 
     * @param request GetFbOssConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFbOssConfigResponse
     */
    public GetFbOssConfigResponse getFbOssConfigWithOptions(GetFbOssConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dirPrefix)) {
            body.put("DirPrefix", request.dirPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDedicatedLine)) {
            body.put("IsDedicatedLine", request.isDedicatedLine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFbOssConfig"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFbOssConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询OSS配置信息</p>
     * 
     * @param request GetFbOssConfigRequest
     * @return GetFbOssConfigResponse
     */
    public GetFbOssConfigResponse getFbOssConfig(GetFbOssConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFbOssConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取OSS配置</p>
     * 
     * @param request GetOssConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOssConfigResponse
     */
    public GetOssConfigResponse getOssConfigWithOptions(GetOssConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOssConfig"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOssConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取OSS配置</p>
     * 
     * @param request GetOssConfigRequest
     * @return GetOssConfigResponse
     */
    public GetOssConfigResponse getOssConfig(GetOssConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOssConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取版本下载地址</p>
     * 
     * @param request GetVersionDownloadUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVersionDownloadUrlResponse
     */
    public GetVersionDownloadUrlResponse getVersionDownloadUrlWithOptions(GetVersionDownloadUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.versionName)) {
            query.put("VersionName", request.versionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVersionDownloadUrl"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVersionDownloadUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取版本下载地址</p>
     * 
     * @param request GetVersionDownloadUrlRequest
     * @return GetVersionDownloadUrlResponse
     */
    public GetVersionDownloadUrlResponse getVersionDownloadUrl(GetVersionDownloadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVersionDownloadUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取租户ota任务</p>
     * 
     * @param request ListDeviceOtaTaskByTenantRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDeviceOtaTaskByTenantResponse
     */
    public ListDeviceOtaTaskByTenantResponse listDeviceOtaTaskByTenantWithOptions(ListDeviceOtaTaskByTenantRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeviceOtaTaskByTenant"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeviceOtaTaskByTenantResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取租户ota任务</p>
     * 
     * @param request ListDeviceOtaTaskByTenantRequest
     * @return ListDeviceOtaTaskByTenantResponse
     */
    public ListDeviceOtaTaskByTenantResponse listDeviceOtaTaskByTenant(ListDeviceOtaTaskByTenantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeviceOtaTaskByTenantWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询设备座位列表</p>
     * 
     * @param request ListDeviceSeatsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDeviceSeatsResponse
     */
    public ListDeviceSeatsResponse listDeviceSeatsWithOptions(ListDeviceSeatsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.label)) {
            body.put("Label", request.label);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seatNo)) {
            body.put("SeatNo", request.seatNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNoList)) {
            body.put("SerialNoList", request.serialNoList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            body.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeviceSeats"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeviceSeatsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询设备座位列表</p>
     * 
     * @param request ListDeviceSeatsRequest
     * @return ListDeviceSeatsResponse
     */
    public ListDeviceSeatsResponse listDeviceSeats(ListDeviceSeatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeviceSeatsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取设备列表</p>
     * 
     * @param request ListDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDevicesResponse
     */
    public ListDevicesResponse listDevicesWithOptions(ListDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            query.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceIpV4)) {
            query.put("DeviceIpV4", request.deviceIpV4);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            query.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceOS)) {
            query.put("DeviceOS", request.deviceOS);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devicePlatform)) {
            query.put("DevicePlatform", request.devicePlatform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationInfo)) {
            query.put("LocationInfo", request.locationInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            query.put("UserType", request.userType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alias)) {
            body.put("Alias", request.alias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buildId)) {
            body.put("BuildId", request.buildId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupId)) {
            body.put("DeviceGroupId", request.deviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            body.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelContent)) {
            body.put("LabelContent", request.labelContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelId)) {
            body.put("LabelId", request.labelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNo)) {
            body.put("SerialNo", request.serialNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDevices"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDevicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取设备列表</p>
     * 
     * @param request ListDevicesRequest
     * @return ListDevicesResponse
     */
    public ListDevicesResponse listDevices(ListDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDevicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户问题标签</p>
     * 
     * @param request ListFbIssueLabelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFbIssueLabelsResponse
     */
    public ListFbIssueLabelsResponse listFbIssueLabelsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFbIssueLabels"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFbIssueLabelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户问题标签</p>
     * @return ListFbIssueLabelsResponse
     */
    public ListFbIssueLabelsResponse listFbIssueLabels() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFbIssueLabelsWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据语言类型和调用方查询标签列表</p>
     * 
     * @param request ListFbIssueLabelsByLCRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFbIssueLabelsByLCResponse
     */
    public ListFbIssueLabelsByLCResponse listFbIssueLabelsByLCWithOptions(ListFbIssueLabelsByLCRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            body.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.languageType)) {
            body.put("LanguageType", request.languageType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFbIssueLabelsByLC"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFbIssueLabelsByLCResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据语言类型和调用方查询标签列表</p>
     * 
     * @param request ListFbIssueLabelsByLCRequest
     * @return ListFbIssueLabelsByLCResponse
     */
    public ListFbIssueLabelsByLCResponse listFbIssueLabelsByLC(ListFbIssueLabelsByLCRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFbIssueLabelsByLCWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取标签列表</p>
     * 
     * @param request ListLabelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLabelsResponse
     */
    public ListLabelsResponse listLabelsWithOptions(ListLabelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labelContent)) {
            body.put("LabelContent", request.labelContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelId)) {
            body.put("LabelId", request.labelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLabels"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLabelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取标签列表</p>
     * 
     * @param request ListLabelsRequest
     * @return ListLabelsResponse
     */
    public ListLabelsResponse listLabels(ListLabelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLabelsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取租户升级设备信息</p>
     * 
     * @param request ListTenantDeviceOtaInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTenantDeviceOtaInfoResponse
     */
    public ListTenantDeviceOtaInfoResponse listTenantDeviceOtaInfoWithOptions(ListTenantDeviceOtaInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTenantDeviceOtaInfo"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTenantDeviceOtaInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取租户升级设备信息</p>
     * 
     * @param request ListTenantDeviceOtaInfoRequest
     * @return ListTenantDeviceOtaInfoResponse
     */
    public ListTenantDeviceOtaInfoResponse listTenantDeviceOtaInfo(ListTenantDeviceOtaInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTenantDeviceOtaInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询终端列表</p>
     * 
     * @param request ListTerminalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTerminalResponse
     */
    public ListTerminalResponse listTerminalWithOptions(ListTerminalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alias)) {
            body.put("Alias", request.alias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buildId)) {
            body.put("BuildId", request.buildId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            body.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inManage)) {
            body.put("InManage", request.inManage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipv4)) {
            body.put("Ipv4", request.ipv4);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationInfo)) {
            body.put("LocationInfo", request.locationInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKeyword)) {
            body.put("SearchKeyword", request.searchKeyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            body.put("SerialNumber", request.serialNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terminalGroupId)) {
            body.put("TerminalGroupId", request.terminalGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTerminal"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTerminalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询终端列表</p>
     * 
     * @param request ListTerminalRequest
     * @return ListTerminalResponse
     */
    public ListTerminalResponse listTerminal(ListTerminalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTerminalWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询终端基本信息</p>
     * 
     * @param request ListTerminalsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTerminalsResponse
     */
    public ListTerminalsResponse listTerminalsWithOptions(ListTerminalsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serialNumbers)) {
            query.put("SerialNumbers", request.serialNumbers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuids)) {
            query.put("Uuids", request.uuids);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKeyword)) {
            body.put("SearchKeyword", request.searchKeyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terminalGroupId)) {
            body.put("TerminalGroupId", request.terminalGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTerminals"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTerminalsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询终端基本信息</p>
     * 
     * @param request ListTerminalsRequest
     * @return ListTerminalsResponse
     */
    public ListTerminalsResponse listTerminals(ListTerminalsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTerminalsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询可信设备列表</p>
     * 
     * @param request ListTrustDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTrustDevicesResponse
     */
    public ListTrustDevicesResponse listTrustDevicesWithOptions(ListTrustDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labelContent)) {
            body.put("LabelContent", request.labelContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelId)) {
            body.put("LabelId", request.labelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNo)) {
            body.put("SerialNo", request.serialNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCustomId)) {
            body.put("UserCustomId", request.userCustomId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTrustDevices"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTrustDevicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询可信设备列表</p>
     * 
     * @param request ListTrustDevicesRequest
     * @return ListTrustDevicesResponse
     */
    public ListTrustDevicesResponse listTrustDevices(ListTrustDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTrustDevicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询问题反馈列表</p>
     * 
     * @param request ListUserFbAcIssuesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserFbAcIssuesResponse
     */
    public ListUserFbAcIssuesResponse listUserFbAcIssuesWithOptions(ListUserFbAcIssuesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            body.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVersion)) {
            body.put("ClientVersion", request.clientVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorMessage)) {
            body.put("ErrorMessage", request.errorMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.issueId)) {
            body.put("IssueId", request.issueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.label)) {
            body.put("Label", request.label);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reservedA)) {
            body.put("ReservedA", request.reservedA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reservedB)) {
            body.put("ReservedB", request.reservedB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userEmail)) {
            body.put("UserEmail", request.userEmail);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserFbAcIssues"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserFbAcIssuesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询问题反馈列表</p>
     * 
     * @param request ListUserFbAcIssuesRequest
     * @return ListUserFbAcIssuesResponse
     */
    public ListUserFbAcIssuesResponse listUserFbAcIssues(ListUserFbAcIssuesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserFbAcIssuesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户反馈问题列表</p>
     * 
     * @param request ListUserFbIssuesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserFbIssuesResponse
     */
    public ListUserFbIssuesResponse listUserFbIssuesWithOptions(ListUserFbIssuesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientModel)) {
            body.put("ClientModel", request.clientModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientSn)) {
            body.put("ClientSn", request.clientSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerId)) {
            body.put("CustomerId", request.customerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            body.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorCode)) {
            body.put("ErrorCode", request.errorCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorMsg)) {
            body.put("ErrorMsg", request.errorMsg);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fbType)) {
            body.put("FbType", request.fbType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.issueId)) {
            body.put("IssueId", request.issueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.issueLabel)) {
            body.put("IssueLabel", request.issueLabel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userEmail)) {
            body.put("UserEmail", request.userEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wasRead)) {
            body.put("WasRead", request.wasRead);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserFbIssues"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserFbIssuesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户反馈问题列表</p>
     * 
     * @param request ListUserFbIssuesRequest
     * @return ListUserFbIssuesResponse
     */
    public ListUserFbIssuesResponse listUserFbIssues(ListUserFbIssuesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserFbIssuesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改设备安全入网类型</p>
     * 
     * @param request ModifyDevicesSecureNetworkTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDevicesSecureNetworkTypeResponse
     */
    public ModifyDevicesSecureNetworkTypeResponse modifyDevicesSecureNetworkTypeWithOptions(ModifyDevicesSecureNetworkTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allDevices)) {
            body.put("AllDevices", request.allDevices);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secureNetworkType)) {
            body.put("SecureNetworkType", request.secureNetworkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNos)) {
            body.put("SerialNos", request.serialNos);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDevicesSecureNetworkType"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDevicesSecureNetworkTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改设备安全入网类型</p>
     * 
     * @param request ModifyDevicesSecureNetworkTypeRequest
     * @return ModifyDevicesSecureNetworkTypeResponse
     */
    public ModifyDevicesSecureNetworkTypeResponse modifyDevicesSecureNetworkType(ModifyDevicesSecureNetworkTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDevicesSecureNetworkTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>匿名api修改安全入网配置</p>
     * 
     * @param request ModifySecureNetworkTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySecureNetworkTypeResponse
     */
    public ModifySecureNetworkTypeResponse modifySecureNetworkTypeWithOptions(ModifySecureNetworkTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.secureNetworkType)) {
            body.put("SecureNetworkType", request.secureNetworkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNo)) {
            body.put("SerialNo", request.serialNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySecureNetworkType"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySecureNetworkTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>匿名api修改安全入网配置</p>
     * 
     * @param request ModifySecureNetworkTypeRequest
     * @return ModifySecureNetworkTypeResponse
     */
    public ModifySecureNetworkTypeResponse modifySecureNetworkType(ModifySecureNetworkTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySecureNetworkTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设备注册</p>
     * 
     * @param request RegisterDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterDeviceResponse
     */
    public RegisterDeviceResponse registerDeviceWithOptions(RegisterDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bluetooth)) {
            body.put("Bluetooth", request.bluetooth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buildId)) {
            body.put("BuildId", request.buildId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chipId)) {
            body.put("ChipId", request.chipId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            body.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            body.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customId)) {
            body.put("CustomId", request.customId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.etherMac)) {
            body.put("EtherMac", request.etherMac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            body.put("Memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNo)) {
            body.put("SerialNo", request.serialNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storage)) {
            body.put("Storage", request.storage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            body.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wlan)) {
            body.put("Wlan", request.wlan);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterDevice"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterDeviceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设备注册</p>
     * 
     * @param request RegisterDeviceRequest
     * @return RegisterDeviceResponse
     */
    public RegisterDeviceResponse registerDevice(RegisterDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>上报升级信息</p>
     * 
     * @param request ReportAppOtaInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReportAppOtaInfoResponse
     */
    public ReportAppOtaInfoResponse reportAppOtaInfoWithOptions(ReportAppOtaInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseVersion)) {
            query.put("BaseVersion", request.baseVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            query.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientUid)) {
            query.put("ClientUid", request.clientUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            query.put("Note", request.note);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            query.put("OsType", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetVersion)) {
            query.put("TargetVersion", request.targetVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskUid)) {
            query.put("TaskUid", request.taskUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportAppOtaInfo"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportAppOtaInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>上报升级信息</p>
     * 
     * @param request ReportAppOtaInfoRequest
     * @return ReportAppOtaInfoResponse
     */
    public ReportAppOtaInfoResponse reportAppOtaInfo(ReportAppOtaInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reportAppOtaInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>升级信息上报</p>
     * 
     * @param request ReportDeviceOtaInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReportDeviceOtaInfoResponse
     */
    public ReportDeviceOtaInfoResponse reportDeviceOtaInfoWithOptions(ReportDeviceOtaInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseVersion)) {
            body.put("BaseVersion", request.baseVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            body.put("Note", request.note);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetVersion)) {
            body.put("TargetVersion", request.targetVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportDeviceOtaInfo"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportDeviceOtaInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>升级信息上报</p>
     * 
     * @param request ReportDeviceOtaInfoRequest
     * @return ReportDeviceOtaInfoResponse
     */
    public ReportDeviceOtaInfoResponse reportDeviceOtaInfo(ReportDeviceOtaInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reportDeviceOtaInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>应用中心用户问题反馈</p>
     * 
     * @param tmpReq ReportUserFbAcIssueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReportUserFbAcIssueResponse
     */
    public ReportUserFbAcIssueResponse reportUserFbAcIssueWithOptions(ReportUserFbAcIssueRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ReportUserFbAcIssueShrinkRequest request = new ReportUserFbAcIssueShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.fileList)) {
            request.fileListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.fileList, "FileList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            body.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVersion)) {
            body.put("ClientVersion", request.clientVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorMsg)) {
            body.put("ErrorMsg", request.errorMsg);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileListShrink)) {
            body.put("FileList", request.fileListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reservedA)) {
            body.put("ReservedA", request.reservedA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reservedB)) {
            body.put("ReservedB", request.reservedB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userEmail)) {
            body.put("UserEmail", request.userEmail);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportUserFbAcIssue"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportUserFbAcIssueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>应用中心用户问题反馈</p>
     * 
     * @param request ReportUserFbAcIssueRequest
     * @return ReportUserFbAcIssueResponse
     */
    public ReportUserFbAcIssueResponse reportUserFbAcIssue(ReportUserFbAcIssueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reportUserFbAcIssueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>上报用户反馈问题</p>
     * 
     * @param tmpReq ReportUserFbIssueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReportUserFbIssueResponse
     */
    public ReportUserFbIssueResponse reportUserFbIssueWithOptions(ReportUserFbIssueRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ReportUserFbIssueShrinkRequest request = new ReportUserFbIssueShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.fileList)) {
            request.fileListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.fileList, "FileList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientModel)) {
            body.put("ClientModel", request.clientModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientOsName)) {
            body.put("ClientOsName", request.clientOsName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientSn)) {
            body.put("ClientSn", request.clientSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVersion)) {
            body.put("ClientVersion", request.clientVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerId)) {
            body.put("CustomerId", request.customerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            body.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopType)) {
            body.put("DesktopType", request.desktopType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorCode)) {
            body.put("ErrorCode", request.errorCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorMsg)) {
            body.put("ErrorMsg", request.errorMsg);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fbType)) {
            body.put("FbType", request.fbType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileListShrink)) {
            body.put("FileList", request.fileListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.issueLabel)) {
            body.put("IssueLabel", request.issueLabel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.occurTime)) {
            body.put("OccurTime", request.occurTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reservedA)) {
            body.put("ReservedA", request.reservedA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reservedB)) {
            body.put("ReservedB", request.reservedB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telNo)) {
            body.put("TelNo", request.telNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userEmail)) {
            body.put("UserEmail", request.userEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wyId)) {
            body.put("WyId", request.wyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportUserFbIssue"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportUserFbIssueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>上报用户反馈问题</p>
     * 
     * @param request ReportUserFbIssueRequest
     * @return ReportUserFbIssueResponse
     */
    public ReportUserFbIssueResponse reportUserFbIssue(ReportUserFbIssueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reportUserFbIssueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>向终端发送运维命令</p>
     * 
     * @param request SendOpsMessageToTerminalsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendOpsMessageToTerminalsResponse
     */
    public SendOpsMessageToTerminalsResponse sendOpsMessageToTerminalsWithOptions(SendOpsMessageToTerminalsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.delay)) {
            query.put("Delay", request.delay);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.msg)) {
            body.put("Msg", request.msg);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opsAction)) {
            body.put("OpsAction", request.opsAction);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.uuids)) {
            bodyFlat.put("Uuids", request.uuids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitForAck)) {
            body.put("WaitForAck", request.waitForAck);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendOpsMessageToTerminals"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendOpsMessageToTerminalsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>向终端发送运维命令</p>
     * 
     * @param request SendOpsMessageToTerminalsRequest
     * @return SendOpsMessageToTerminalsResponse
     */
    public SendOpsMessageToTerminalsResponse sendOpsMessageToTerminals(SendOpsMessageToTerminalsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendOpsMessageToTerminalsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置租户ota自动开启/关闭</p>
     * 
     * @param request SetDeviceOtaAutoStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDeviceOtaAutoStatusResponse
     */
    public SetDeviceOtaAutoStatusResponse setDeviceOtaAutoStatusWithOptions(SetDeviceOtaAutoStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoUpdate)) {
            body.put("AutoUpdate", request.autoUpdate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoUpdateTimeSchedule)) {
            body.put("AutoUpdateTimeSchedule", request.autoUpdateTimeSchedule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            body.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceUpgrade)) {
            body.put("ForceUpgrade", request.forceUpgrade);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDeviceOtaAutoStatus"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDeviceOtaAutoStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置租户ota自动开启/关闭</p>
     * 
     * @param request SetDeviceOtaAutoStatusRequest
     * @return SetDeviceOtaAutoStatusResponse
     */
    public SetDeviceOtaAutoStatusResponse setDeviceOtaAutoStatus(SetDeviceOtaAutoStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDeviceOtaAutoStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>租户设置设备ota任务的状态</p>
     * 
     * @param request SetDeviceOtaTaskStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDeviceOtaTaskStatusResponse
     */
    public SetDeviceOtaTaskStatusResponse setDeviceOtaTaskStatusWithOptions(SetDeviceOtaTaskStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operationStatus)) {
            body.put("OperationStatus", request.operationStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDeviceOtaTaskStatus"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDeviceOtaTaskStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>租户设置设备ota任务的状态</p>
     * 
     * @param request SetDeviceOtaTaskStatusRequest
     * @return SetDeviceOtaTaskStatusResponse
     */
    public SetDeviceOtaTaskStatusResponse setDeviceOtaTaskStatus(SetDeviceOtaTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDeviceOtaTaskStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>解绑免账号登录用户</p>
     * 
     * @param request UnbindAccountLessLoginUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindAccountLessLoginUserResponse
     */
    public UnbindAccountLessLoginUserResponse unbindAccountLessLoginUserWithOptions(UnbindAccountLessLoginUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            body.put("SerialNumber", request.serialNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindAccountLessLoginUser"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindAccountLessLoginUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>解绑免账号登录用户</p>
     * 
     * @param request UnbindAccountLessLoginUserRequest
     * @return UnbindAccountLessLoginUserResponse
     */
    public UnbindAccountLessLoginUserResponse unbindAccountLessLoginUser(UnbindAccountLessLoginUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindAccountLessLoginUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>解绑设备座位</p>
     * 
     * @param tmpReq UnbindDeviceSeatsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindDeviceSeatsResponse
     */
    public UnbindDeviceSeatsResponse unbindDeviceSeatsWithOptions(UnbindDeviceSeatsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UnbindDeviceSeatsShrinkRequest request = new UnbindDeviceSeatsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.serialNoList)) {
            request.serialNoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.serialNoList, "SerialNoList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serialNoListShrink)) {
            body.put("SerialNoList", request.serialNoListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindDeviceSeats"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindDeviceSeatsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>解绑设备座位</p>
     * 
     * @param request UnbindDeviceSeatsRequest
     * @return UnbindDeviceSeatsResponse
     */
    public UnbindDeviceSeatsResponse unbindDeviceSeats(UnbindDeviceSeatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindDeviceSeatsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新设备别名</p>
     * 
     * @param request UpdateAliasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAliasResponse
     */
    public UpdateAliasResponse updateAliasWithOptions(UpdateAliasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alias)) {
            body.put("Alias", request.alias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNo)) {
            body.put("SerialNo", request.serialNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAlias"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAliasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新设备别名</p>
     * 
     * @param request UpdateAliasRequest
     * @return UpdateAliasResponse
     */
    public UpdateAliasResponse updateAlias(UpdateAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAliasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量更新设备绑定的终端用户</p>
     * 
     * @param request UpdateDeviceBindedEndUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDeviceBindedEndUserResponse
     */
    public UpdateDeviceBindedEndUserResponse updateDeviceBindedEndUserWithOptions(UpdateDeviceBindedEndUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serialNo)) {
            body.put("SerialNo", request.serialNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceAdEndUsers)) {
            body.put("SourceAdEndUsers", request.sourceAdEndUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndUserIds)) {
            body.put("SourceEndUserIds", request.sourceEndUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetAdEndUsers)) {
            body.put("TargetAdEndUsers", request.targetAdEndUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetEndUserIds)) {
            body.put("TargetEndUserIds", request.targetEndUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            body.put("UserType", request.userType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDeviceBindedEndUser"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDeviceBindedEndUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量更新设备绑定的终端用户</p>
     * 
     * @param request UpdateDeviceBindedEndUserRequest
     * @return UpdateDeviceBindedEndUserResponse
     */
    public UpdateDeviceBindedEndUserResponse updateDeviceBindedEndUser(UpdateDeviceBindedEndUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDeviceBindedEndUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改标签</p>
     * 
     * @param request UpdateLabelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLabelResponse
     */
    public UpdateLabelResponse updateLabelWithOptions(UpdateLabelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labelContent)) {
            body.put("LabelContent", request.labelContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelId)) {
            body.put("LabelId", request.labelId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLabel"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLabelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改标签</p>
     * 
     * @param request UpdateLabelRequest
     * @return UpdateLabelResponse
     */
    public UpdateLabelResponse updateLabel(UpdateLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLabelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改终端策略</p>
     * 
     * @param request UpdateTerminalPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTerminalPolicyResponse
     */
    public UpdateTerminalPolicyResponse updateTerminalPolicyWithOptions(UpdateTerminalPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backgroundModeTitle)) {
            body.put("BackgroundModeTitle", request.backgroundModeTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayLayout)) {
            body.put("DisplayLayout", request.displayLayout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayResolution)) {
            body.put("DisplayResolution", request.displayResolution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayScaleRatio)) {
            body.put("DisplayScaleRatio", request.displayScaleRatio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAutoLockScreen)) {
            body.put("EnableAutoLockScreen", request.enableAutoLockScreen);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAutoLogin)) {
            body.put("EnableAutoLogin", request.enableAutoLogin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableBackgroundMode)) {
            body.put("EnableBackgroundMode", request.enableBackgroundMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableBluetooth)) {
            body.put("EnableBluetooth", request.enableBluetooth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableModifyPassword)) {
            body.put("EnableModifyPassword", request.enableModifyPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableScheduledReboot)) {
            body.put("EnableScheduledReboot", request.enableScheduledReboot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableScheduledShutdown)) {
            body.put("EnableScheduledShutdown", request.enableScheduledShutdown);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSwitchPersonal)) {
            body.put("EnableSwitchPersonal", request.enableSwitchPersonal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableWlan)) {
            body.put("EnableWlan", request.enableWlan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idleTimeout)) {
            body.put("IdleTimeout", request.idleTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idleTimeoutAction)) {
            body.put("IdleTimeoutAction", request.idleTimeoutAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.powerButtonDefine)) {
            body.put("PowerButtonDefine", request.powerButtonDefine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.powerButtonDefineForAs)) {
            body.put("PowerButtonDefineForAs", request.powerButtonDefineForAs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.powerButtonDefineForNs)) {
            body.put("PowerButtonDefineForNs", request.powerButtonDefineForNs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.powerOnBehavior)) {
            body.put("PowerOnBehavior", request.powerOnBehavior);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduledReboot)) {
            body.put("ScheduledReboot", request.scheduledReboot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduledShutdown)) {
            body.put("ScheduledShutdown", request.scheduledShutdown);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.settingLock)) {
            body.put("SettingLock", request.settingLock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terminalPolicyId)) {
            body.put("TerminalPolicyId", request.terminalPolicyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTerminalPolicy"),
            new TeaPair("version", "2021-04-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTerminalPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改终端策略</p>
     * 
     * @param request UpdateTerminalPolicyRequest
     * @return UpdateTerminalPolicyResponse
     */
    public UpdateTerminalPolicyResponse updateTerminalPolicy(UpdateTerminalPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTerminalPolicyWithOptions(request, runtime);
    }
}
