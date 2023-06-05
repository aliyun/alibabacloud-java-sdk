// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515;

import com.aliyun.tea.*;
import com.aliyun.vcs20200515.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("vcs", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddAiotDevicesResponse addAiotDevicesWithOptions(AddAiotDevicesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddAiotDevicesShrinkRequest request = new AddAiotDevicesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.aiotDeviceList)) {
            request.aiotDeviceListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.aiotDeviceList, "AiotDeviceList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aiotDeviceListShrink)) {
            body.put("AiotDeviceList", request.aiotDeviceListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddAiotDevices"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAiotDevicesResponse());
    }

    public AddAiotDevicesResponse addAiotDevices(AddAiotDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAiotDevicesWithOptions(request, runtime);
    }

    public AddAiotPersonTableResponse addAiotPersonTableWithOptions(AddAiotPersonTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.personTable)) {
            bodyFlat.put("PersonTable", request.personTable);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddAiotPersonTable"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAiotPersonTableResponse());
    }

    public AddAiotPersonTableResponse addAiotPersonTable(AddAiotPersonTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAiotPersonTableWithOptions(request, runtime);
    }

    public AddAiotPersonTableItemsResponse addAiotPersonTableItemsWithOptions(AddAiotPersonTableItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personTableId)) {
            body.put("PersonTableId", request.personTableId);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.personTableItemList)) {
            bodyFlat.put("PersonTableItemList", request.personTableItemList);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddAiotPersonTableItems"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAiotPersonTableItemsResponse());
    }

    public AddAiotPersonTableItemsResponse addAiotPersonTableItems(AddAiotPersonTableItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAiotPersonTableItemsWithOptions(request, runtime);
    }

    public AddAiotPersonTableItemsForTablesResponse addAiotPersonTableItemsForTablesWithOptions(AddAiotPersonTableItemsForTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.personTableItemList)) {
            bodyFlat.put("PersonTableItemList", request.personTableItemList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personTableList)) {
            bodyFlat.put("PersonTableList", request.personTableList);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddAiotPersonTableItemsForTables"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAiotPersonTableItemsForTablesResponse());
    }

    public AddAiotPersonTableItemsForTablesResponse addAiotPersonTableItemsForTables(AddAiotPersonTableItemsForTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAiotPersonTableItemsForTablesWithOptions(request, runtime);
    }

    public AddAiotVehicleTableItemsResponse addAiotVehicleTableItemsWithOptions(AddAiotVehicleTableItemsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddAiotVehicleTableItemsShrinkRequest request = new AddAiotVehicleTableItemsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.vehicleTableItem)) {
            request.vehicleTableItemShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.vehicleTableItem, "VehicleTableItem", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vehicleTableId)) {
            body.put("VehicleTableId", request.vehicleTableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vehicleTableItemShrink)) {
            body.put("VehicleTableItem", request.vehicleTableItemShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddAiotVehicleTableItems"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAiotVehicleTableItemsResponse());
    }

    public AddAiotVehicleTableItemsResponse addAiotVehicleTableItems(AddAiotVehicleTableItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAiotVehicleTableItemsWithOptions(request, runtime);
    }

    public AddCameraForInstanceResponse addCameraForInstanceWithOptions(AddCameraForInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddCameraForInstanceShrinkRequest request = new AddCameraForInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.cameraIds)) {
            request.cameraIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.cameraIds, "CameraIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cameraIdsShrink)) {
            body.put("CameraIds", request.cameraIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddCameraForInstance"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddCameraForInstanceResponse());
    }

    public AddCameraForInstanceResponse addCameraForInstance(AddCameraForInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCameraForInstanceWithOptions(request, runtime);
    }

    public AddChannelResponse addChannelWithOptions(AddChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.parentDeviceGbId)) {
            body.put("ParentDeviceGbId", request.parentDeviceGbId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddChannel"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddChannelResponse());
    }

    public AddChannelResponse addChannel(AddChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addChannelWithOptions(request, runtime);
    }

    public AddDataSourceResponse addDataSourceWithOptions(AddDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceName)) {
            body.put("DataSourceName", request.dataSourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            body.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDataSource"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDataSourceResponse());
    }

    public AddDataSourceResponse addDataSource(AddDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDataSourceWithOptions(request, runtime);
    }

    public AddDeviceResponse addDeviceWithOptions(AddDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bitRate)) {
            body.put("BitRate", request.bitRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceAddress)) {
            body.put("DeviceAddress", request.deviceAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceDirection)) {
            body.put("DeviceDirection", request.deviceDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceResolution)) {
            body.put("DeviceResolution", request.deviceResolution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceSite)) {
            body.put("DeviceSite", request.deviceSite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceType)) {
            body.put("DeviceType", request.deviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gbId)) {
            body.put("GbId", request.gbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendor)) {
            body.put("Vendor", request.vendor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDevice"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDeviceResponse());
    }

    public AddDeviceResponse addDevice(AddDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDeviceWithOptions(request, runtime);
    }

    public AddDoubleVerificationGroupsResponse addDoubleVerificationGroupsWithOptions(AddDoubleVerificationGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.doubleVerificationGroupList)) {
            bodyFlat.put("DoubleVerificationGroupList", request.doubleVerificationGroupList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDoubleVerificationGroups"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDoubleVerificationGroupsResponse());
    }

    public AddDoubleVerificationGroupsResponse addDoubleVerificationGroups(AddDoubleVerificationGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDoubleVerificationGroupsWithOptions(request, runtime);
    }

    public AddMonitorResponse addMonitorWithOptions(AddMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmVendor)) {
            body.put("AlgorithmVendor", request.algorithmVendor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchIndicator)) {
            body.put("BatchIndicator", request.batchIndicator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorType)) {
            body.put("MonitorType", request.monitorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifierAppSecret)) {
            body.put("NotifierAppSecret", request.notifierAppSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifierExtendValues)) {
            body.put("NotifierExtendValues", request.notifierExtendValues);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifierTimeOut)) {
            body.put("NotifierTimeOut", request.notifierTimeOut);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifierType)) {
            body.put("NotifierType", request.notifierType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifierUrl)) {
            body.put("NotifierUrl", request.notifierUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddMonitor"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddMonitorResponse());
    }

    public AddMonitorResponse addMonitor(AddMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addMonitorWithOptions(request, runtime);
    }

    public AddProfileResponse addProfileWithOptions(AddProfileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceUrl)) {
            body.put("FaceUrl", request.faceUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gender)) {
            body.put("Gender", request.gender);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idNumber)) {
            body.put("IdNumber", request.idNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvSubId)) {
            body.put("IsvSubId", request.isvSubId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveAddress)) {
            body.put("LiveAddress", request.liveAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNo)) {
            body.put("PhoneNo", request.phoneNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plateNo)) {
            body.put("PlateNo", request.plateNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneType)) {
            body.put("SceneType", request.sceneType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddProfile"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddProfileResponse());
    }

    public AddProfileResponse addProfile(AddProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addProfileWithOptions(request, runtime);
    }

    public AddProfileCatalogResponse addProfileCatalogWithOptions(AddProfileCatalogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            body.put("CatalogName", request.catalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvSubId)) {
            body.put("IsvSubId", request.isvSubId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentCatalogId)) {
            body.put("ParentCatalogId", request.parentCatalogId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddProfileCatalog"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddProfileCatalogResponse());
    }

    public AddProfileCatalogResponse addProfileCatalog(AddProfileCatalogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addProfileCatalogWithOptions(request, runtime);
    }

    public AddSearchItemsResponse addSearchItemsWithOptions(AddSearchItemsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddSearchItemsShrinkRequest request = new AddSearchItemsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.searchItemList)) {
            request.searchItemListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.searchItemList, "SearchItemList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.searchItemListShrink)) {
            body.put("SearchItemList", request.searchItemListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchTableId)) {
            body.put("SearchTableId", request.searchTableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddSearchItems"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSearchItemsResponse());
    }

    public AddSearchItemsResponse addSearchItems(AddSearchItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addSearchItemsWithOptions(request, runtime);
    }

    public AddWatchItemsResponse addWatchItemsWithOptions(AddWatchItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.watchItemList)) {
            bodyFlat.put("WatchItemList", request.watchItemList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watchPolicyId)) {
            body.put("WatchPolicyId", request.watchPolicyId);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddWatchItems"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddWatchItemsResponse());
    }

    public AddWatchItemsResponse addWatchItems(AddWatchItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addWatchItemsWithOptions(request, runtime);
    }

    public BatchDeleteInstanceResponse batchDeleteInstanceWithOptions(BatchDeleteInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchDeleteInstanceShrinkRequest request = new BatchDeleteInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            body.put("InstanceIds", request.instanceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeleteInstance"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeleteInstanceResponse());
    }

    public BatchDeleteInstanceResponse batchDeleteInstance(BatchDeleteInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchDeleteInstanceWithOptions(request, runtime);
    }

    public BindCorpGroupResponse bindCorpGroupWithOptions(BindCorpGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpGroupId)) {
            body.put("CorpGroupId", request.corpGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindCorpGroup"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindCorpGroupResponse());
    }

    public BindCorpGroupResponse bindCorpGroup(BindCorpGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindCorpGroupWithOptions(request, runtime);
    }

    public BindDevicesResponse bindDevicesWithOptions(BindDevicesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BindDevicesShrinkRequest request = new BindDevicesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.subDeviceList)) {
            request.subDeviceListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.subDeviceList, "SubDeviceList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDeviceListShrink)) {
            body.put("SubDeviceList", request.subDeviceListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindDevices"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindDevicesResponse());
    }

    public BindDevicesResponse bindDevices(BindDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindDevicesWithOptions(request, runtime);
    }

    public BindPersonResponse bindPersonWithOptions(BindPersonRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvSubId)) {
            body.put("IsvSubId", request.isvSubId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personId)) {
            body.put("PersonId", request.personId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personMatchingRate)) {
            body.put("PersonMatchingRate", request.personMatchingRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profileId)) {
            body.put("ProfileId", request.profileId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindPerson"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindPersonResponse());
    }

    public BindPersonResponse bindPerson(BindPersonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindPersonWithOptions(request, runtime);
    }

    public BindUserResponse bindUserWithOptions(BindUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvSubId)) {
            body.put("IsvSubId", request.isvSubId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchingRate)) {
            body.put("MatchingRate", request.matchingRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personId)) {
            body.put("PersonId", request.personId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindUser"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindUserResponse());
    }

    public BindUserResponse bindUser(BindUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindUserWithOptions(request, runtime);
    }

    public CheckAIInstanceNameResponse checkAIInstanceNameWithOptions(CheckAIInstanceNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckAIInstanceName"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckAIInstanceNameResponse());
    }

    public CheckAIInstanceNameResponse checkAIInstanceName(CheckAIInstanceNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkAIInstanceNameWithOptions(request, runtime);
    }

    public CheckSLRResponse checkSLRWithOptions(CheckSLRRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckSLR"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckSLRResponse());
    }

    public CheckSLRResponse checkSLR(CheckSLRRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkSLRWithOptions(request, runtime);
    }

    public ControlAiotDeviceResponse controlAiotDeviceWithOptions(ControlAiotDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.associatedDeviceId)) {
            body.put("AssociatedDeviceId", request.associatedDeviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.associatedIPAddr)) {
            body.put("AssociatedIPAddr", request.associatedIPAddr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.associatedPort)) {
            body.put("AssociatedPort", request.associatedPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.associatedVerificationEnable)) {
            body.put("AssociatedVerificationEnable", request.associatedVerificationEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.barrierCommand)) {
            body.put("BarrierCommand", request.barrierCommand);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkEnabled)) {
            body.put("CheckEnabled", request.checkEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commandType)) {
            body.put("CommandType", request.commandType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.doubleVerificationGroupEnabled)) {
            body.put("DoubleVerificationGroupEnabled", request.doubleVerificationGroupEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gateCtlStatus)) {
            body.put("GateCtlStatus", request.gateCtlStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityNumber)) {
            body.put("IdentityNumber", request.identityNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isProxy)) {
            body.put("IsProxy", request.isProxy);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.miFareCard)) {
            bodyFlat.put("MiFareCard", request.miFareCard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rebootDevice)) {
            body.put("RebootDevice", request.rebootDevice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.singleInterval)) {
            body.put("SingleInterval", request.singleInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.superPassword)) {
            body.put("SuperPassword", request.superPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upgradeFileURL)) {
            body.put("UpgradeFileURL", request.upgradeFileURL);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ControlAiotDevice"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ControlAiotDeviceResponse());
    }

    public ControlAiotDeviceResponse controlAiotDevice(ControlAiotDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.controlAiotDeviceWithOptions(request, runtime);
    }

    public CreateAIInstanceResponse createAIInstanceWithOptions(CreateAIInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAIInstanceShrinkRequest request = new CreateAIInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataSourceTimes)) {
            request.dataSourceTimesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataSourceTimes, "DataSourceTimes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scheduleCycleDates)) {
            request.scheduleCycleDatesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scheduleCycleDates, "ScheduleCycleDates", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scheduleTimes)) {
            request.scheduleTimesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scheduleTimes, "ScheduleTimes", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmId)) {
            body.put("AlgorithmId", request.algorithmId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.algorithmName)) {
            body.put("AlgorithmName", request.algorithmName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.computeType)) {
            body.put("ComputeType", request.computeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerType)) {
            body.put("ContainerType", request.containerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSource)) {
            body.put("DataSource", request.dataSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceTimesShrink)) {
            body.put("DataSourceTimes", request.dataSourceTimesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            body.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fps)) {
            body.put("Fps", request.fps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleCycleDatesShrink)) {
            body.put("ScheduleCycleDates", request.scheduleCycleDatesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTimesShrink)) {
            body.put("ScheduleTimes", request.scheduleTimesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            body.put("ScheduleType", request.scheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spf)) {
            body.put("Spf", request.spf);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAIInstance"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAIInstanceResponse());
    }

    public CreateAIInstanceResponse createAIInstance(CreateAIInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAIInstanceWithOptions(request, runtime);
    }

    public CreateComputeInstanceResponse createComputeInstanceWithOptions(CreateComputeInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateComputeInstanceShrinkRequest request = new CreateComputeInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.algorithms)) {
            request.algorithmsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.algorithms, "Algorithms", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.devices)) {
            request.devicesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.devices, "Devices", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acuUsed)) {
            body.put("AcuUsed", request.acuUsed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.algorithmType)) {
            body.put("AlgorithmType", request.algorithmType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.algorithmsShrink)) {
            body.put("Algorithms", request.algorithmsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.computePictureType)) {
            body.put("ComputePictureType", request.computePictureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.computePictureValue)) {
            body.put("ComputePictureValue", request.computePictureValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasourceType)) {
            body.put("DatasourceType", request.datasourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devicesShrink)) {
            body.put("Devices", request.devicesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isFrameExtraction)) {
            body.put("IsFrameExtraction", request.isFrameExtraction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isPolling)) {
            body.put("IsPolling", request.isPolling);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overallExecutionTime)) {
            body.put("OverallExecutionTime", request.overallExecutionTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picTopic)) {
            body.put("PicTopic", request.picTopic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picType)) {
            body.put("PicType", request.picType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pollingConfigs)) {
            body.put("PollingConfigs", request.pollingConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleCycleDate)) {
            body.put("ScheduleCycleDate", request.scheduleCycleDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleDay)) {
            body.put("ScheduleDay", request.scheduleDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleDaySize)) {
            body.put("ScheduleDaySize", request.scheduleDaySize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTimes)) {
            body.put("ScheduleTimes", request.scheduleTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            body.put("ScheduleType", request.scheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sliceExecutionTime)) {
            body.put("SliceExecutionTime", request.sliceExecutionTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageUsed)) {
            body.put("StorageUsed", request.storageUsed);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateComputeInstance"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateComputeInstanceResponse());
    }

    public CreateComputeInstanceResponse createComputeInstance(CreateComputeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createComputeInstanceWithOptions(request, runtime);
    }

    public CreateCorpResponse createCorpWithOptions(CreateCorpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmType)) {
            body.put("AlgorithmType", request.algorithmType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpName)) {
            body.put("CorpName", request.corpName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iconPath)) {
            body.put("IconPath", request.iconPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvSubId)) {
            body.put("IsvSubId", request.isvSubId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentCorpId)) {
            body.put("ParentCorpId", request.parentCorpId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCorp"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCorpResponse());
    }

    public CreateCorpResponse createCorp(CreateCorpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCorpWithOptions(request, runtime);
    }

    public CreateCorpGroupResponse createCorpGroupWithOptions(CreateCorpGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCorpGroup"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCorpGroupResponse());
    }

    public CreateCorpGroupResponse createCorpGroup(CreateCorpGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCorpGroupWithOptions(request, runtime);
    }

    public CreateDeviceResponse createDeviceWithOptions(CreateDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activateCode)) {
            body.put("ActivateCode", request.activateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.audioEnable)) {
            body.put("AudioEnable", request.audioEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cityCode)) {
            body.put("CityCode", request.cityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceAddress)) {
            body.put("DeviceAddress", request.deviceAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceDirection)) {
            body.put("DeviceDirection", request.deviceDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceModel)) {
            body.put("DeviceModel", request.deviceModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceRate)) {
            body.put("DeviceRate", request.deviceRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceResolution)) {
            body.put("DeviceResolution", request.deviceResolution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceSite)) {
            body.put("DeviceSite", request.deviceSite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceSn)) {
            body.put("DeviceSn", request.deviceSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceType)) {
            body.put("DeviceType", request.deviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encodeFormat)) {
            body.put("EncodeFormat", request.encodeFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frameRate)) {
            body.put("FrameRate", request.frameRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.govLength)) {
            body.put("GovLength", request.govLength);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inProtocol)) {
            body.put("InProtocol", request.inProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.latitude)) {
            body.put("Latitude", request.latitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.longitude)) {
            body.put("Longitude", request.longitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OSDTimeEnable)) {
            body.put("OSDTimeEnable", request.OSDTimeEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OSDTimeType)) {
            body.put("OSDTimeType", request.OSDTimeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OSDTimeX)) {
            body.put("OSDTimeX", request.OSDTimeX);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OSDTimeY)) {
            body.put("OSDTimeY", request.OSDTimeY);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentDeviceId)) {
            body.put("ParentDeviceId", request.parentDeviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roi)) {
            body.put("Roi", request.roi);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDeviceCount)) {
            body.put("SubDeviceCount", request.subDeviceCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDeviceIdList)) {
            body.put("SubDeviceIdList", request.subDeviceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendor)) {
            body.put("Vendor", request.vendor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDevice"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeviceResponse());
    }

    public CreateDeviceResponse createDevice(CreateDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDeviceWithOptions(request, runtime);
    }

    public CreateModelServiceResponse createModelServiceWithOptions(CreateModelServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmCode)) {
            body.put("AlgorithmCode", request.algorithmCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.QPSRequired)) {
            body.put("QPSRequired", request.QPSRequired);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateModelService"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateModelServiceResponse());
    }

    public CreateModelServiceResponse createModelService(CreateModelServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createModelServiceWithOptions(request, runtime);
    }

    /**
      * @deprecated
      *
      * @param request CreateNewDeviceRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateNewDeviceResponse
     */
    // Deprecated
    public CreateNewDeviceResponse createNewDeviceWithOptions(CreateNewDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cityCode)) {
            body.put("CityCode", request.cityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceAddress)) {
            body.put("DeviceAddress", request.deviceAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceModel)) {
            body.put("DeviceModel", request.deviceModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceType)) {
            body.put("DeviceType", request.deviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            body.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inProtocol)) {
            body.put("InProtocol", request.inProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.latitude)) {
            body.put("Latitude", request.latitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.longitude)) {
            body.put("Longitude", request.longitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDeviceCount)) {
            body.put("SubDeviceCount", request.subDeviceCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendor)) {
            body.put("Vendor", request.vendor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNewDevice"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNewDeviceResponse());
    }

    /**
      * @deprecated
      *
      * @param request CreateNewDeviceRequest
      * @return CreateNewDeviceResponse
     */
    // Deprecated
    public CreateNewDeviceResponse createNewDevice(CreateNewDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNewDeviceWithOptions(request, runtime);
    }

    /**
      * @deprecated
      *
      * @param request CreateScanDeviceRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateScanDeviceResponse
     */
    // Deprecated
    public CreateScanDeviceResponse createScanDeviceWithOptions(CreateScanDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.audioEnable)) {
            body.put("AudioEnable", request.audioEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cityCode)) {
            body.put("CityCode", request.cityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceAddress)) {
            body.put("DeviceAddress", request.deviceAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceDirection)) {
            body.put("DeviceDirection", request.deviceDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceModel)) {
            body.put("DeviceModel", request.deviceModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceRate)) {
            body.put("DeviceRate", request.deviceRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceResolution)) {
            body.put("DeviceResolution", request.deviceResolution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceSite)) {
            body.put("DeviceSite", request.deviceSite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceSn)) {
            body.put("DeviceSn", request.deviceSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceType)) {
            body.put("DeviceType", request.deviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encodeFormat)) {
            body.put("EncodeFormat", request.encodeFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frameRate)) {
            body.put("FrameRate", request.frameRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.govLength)) {
            body.put("GovLength", request.govLength);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inProtocol)) {
            body.put("InProtocol", request.inProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.latitude)) {
            body.put("Latitude", request.latitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.longitude)) {
            body.put("Longitude", request.longitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OSDTimeEnable)) {
            body.put("OSDTimeEnable", request.OSDTimeEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OSDTimeType)) {
            body.put("OSDTimeType", request.OSDTimeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OSDTimeX)) {
            body.put("OSDTimeX", request.OSDTimeX);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OSDTimeY)) {
            body.put("OSDTimeY", request.OSDTimeY);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDeviceCount)) {
            body.put("SubDeviceCount", request.subDeviceCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendor)) {
            body.put("Vendor", request.vendor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScanDevice"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScanDeviceResponse());
    }

    /**
      * @deprecated
      *
      * @param request CreateScanDeviceRequest
      * @return CreateScanDeviceResponse
     */
    // Deprecated
    public CreateScanDeviceResponse createScanDevice(CreateScanDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createScanDeviceWithOptions(request, runtime);
    }

    public CreateSearchTableResponse createSearchTableWithOptions(CreateSearchTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmId)) {
            body.put("AlgorithmId", request.algorithmId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchTableName)) {
            body.put("SearchTableName", request.searchTableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            body.put("TargetType", request.targetType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSearchTable"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSearchTableResponse());
    }

    public CreateSearchTableResponse createSearchTable(CreateSearchTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSearchTableWithOptions(request, runtime);
    }

    public CreateSubscribeResponse createSubscribeWithOptions(CreateSubscribeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushConfig)) {
            body.put("PushConfig", request.pushConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSubscribe"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSubscribeResponse());
    }

    public CreateSubscribeResponse createSubscribe(CreateSubscribeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSubscribeWithOptions(request, runtime);
    }

    public CreateUserResponse createUserWithOptions(CreateUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            body.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.age)) {
            body.put("Age", request.age);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attachment)) {
            body.put("Attachment", request.attachment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceImageUrl)) {
            body.put("FaceImageUrl", request.faceImageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gender)) {
            body.put("Gender", request.gender);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idNumber)) {
            body.put("IdNumber", request.idNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvSubId)) {
            body.put("IsvSubId", request.isvSubId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNo)) {
            body.put("PhoneNo", request.phoneNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plateNo)) {
            body.put("PlateNo", request.plateNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            body.put("UserGroupId", request.userGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUser"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserResponse());
    }

    public CreateUserResponse createUser(CreateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserWithOptions(request, runtime);
    }

    public CreateUserGroupResponse createUserGroupWithOptions(CreateUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvSubId)) {
            body.put("IsvSubId", request.isvSubId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentUserGroupId)) {
            body.put("ParentUserGroupId", request.parentUserGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupName)) {
            body.put("UserGroupName", request.userGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUserGroup"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserGroupResponse());
    }

    public CreateUserGroupResponse createUserGroup(CreateUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserGroupWithOptions(request, runtime);
    }

    public CreateVideoComposeTaskResponse createVideoComposeTaskWithOptions(CreateVideoComposeTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.audioFileName)) {
            body.put("AudioFileName", request.audioFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            body.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            body.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageFileNames)) {
            body.put("ImageFileNames", request.imageFileNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageParameters)) {
            body.put("ImageParameters", request.imageParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoFormat)) {
            body.put("VideoFormat", request.videoFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoFrameRate)) {
            body.put("VideoFrameRate", request.videoFrameRate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVideoComposeTask"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVideoComposeTaskResponse());
    }

    public CreateVideoComposeTaskResponse createVideoComposeTask(CreateVideoComposeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVideoComposeTaskWithOptions(request, runtime);
    }

    public CreateVideoSummaryTaskResponse createVideoSummaryTaskWithOptions(CreateVideoSummaryTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTimeStamp)) {
            body.put("EndTimeStamp", request.endTimeStamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveVideoSummary)) {
            body.put("LiveVideoSummary", request.liveVideoSummary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optionList)) {
            body.put("OptionList", request.optionList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimeStamp)) {
            body.put("StartTimeStamp", request.startTimeStamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVideoSummaryTask"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVideoSummaryTaskResponse());
    }

    public CreateVideoSummaryTaskResponse createVideoSummaryTask(CreateVideoSummaryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVideoSummaryTaskWithOptions(request, runtime);
    }

    public CreateWatchPolicyResponse createWatchPolicyWithOptions(CreateWatchPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.itemMatchType)) {
            body.put("ItemMatchType", request.itemMatchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.similarityThreshold)) {
            body.put("SimilarityThreshold", request.similarityThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            body.put("TargetType", request.targetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watchMode)) {
            body.put("WatchMode", request.watchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watchPolicyName)) {
            body.put("WatchPolicyName", request.watchPolicyName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWatchPolicy"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWatchPolicyResponse());
    }

    public CreateWatchPolicyResponse createWatchPolicy(CreateWatchPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWatchPolicyWithOptions(request, runtime);
    }

    public CreateWatchTaskResponse createWatchTaskWithOptions(CreateWatchTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceList)) {
            body.put("DeviceList", request.deviceList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageReceiver)) {
            body.put("MessageReceiver", request.messageReceiver);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleCycleDates)) {
            body.put("ScheduleCycleDates", request.scheduleCycleDates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTimes)) {
            body.put("ScheduleTimes", request.scheduleTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            body.put("ScheduleType", request.scheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watchPolicyIds)) {
            body.put("WatchPolicyIds", request.watchPolicyIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWatchTask"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWatchTaskResponse());
    }

    public CreateWatchTaskResponse createWatchTask(CreateWatchTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWatchTaskWithOptions(request, runtime);
    }

    public DeleteAIInstanceResponse deleteAIInstanceWithOptions(DeleteAIInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteAIInstanceShrinkRequest request = new DeleteAIInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            body.put("InstanceIds", request.instanceIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAIInstance"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAIInstanceResponse());
    }

    public DeleteAIInstanceResponse deleteAIInstance(DeleteAIInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAIInstanceWithOptions(request, runtime);
    }

    public DeleteAiotDeviceResponse deleteAiotDeviceWithOptions(DeleteAiotDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAiotDevice"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAiotDeviceResponse());
    }

    public DeleteAiotDeviceResponse deleteAiotDevice(DeleteAiotDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAiotDeviceWithOptions(request, runtime);
    }

    public DeleteAiotPersonTableResponse deleteAiotPersonTableWithOptions(DeleteAiotPersonTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personTableId)) {
            body.put("PersonTableId", request.personTableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAiotPersonTable"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAiotPersonTableResponse());
    }

    public DeleteAiotPersonTableResponse deleteAiotPersonTable(DeleteAiotPersonTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAiotPersonTableWithOptions(request, runtime);
    }

    public DeleteAiotPersonTableItemResponse deleteAiotPersonTableItemWithOptions(DeleteAiotPersonTableItemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personTableId)) {
            body.put("PersonTableId", request.personTableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personTableItemId)) {
            body.put("PersonTableItemId", request.personTableItemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAiotPersonTableItem"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAiotPersonTableItemResponse());
    }

    public DeleteAiotPersonTableItemResponse deleteAiotPersonTableItem(DeleteAiotPersonTableItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAiotPersonTableItemWithOptions(request, runtime);
    }

    public DeleteAiotVehicleTableItemResponse deleteAiotVehicleTableItemWithOptions(DeleteAiotVehicleTableItemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vehicleTableId)) {
            body.put("VehicleTableId", request.vehicleTableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vehicleTableItemId)) {
            body.put("VehicleTableItemId", request.vehicleTableItemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAiotVehicleTableItem"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAiotVehicleTableItemResponse());
    }

    public DeleteAiotVehicleTableItemResponse deleteAiotVehicleTableItem(DeleteAiotVehicleTableItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAiotVehicleTableItemWithOptions(request, runtime);
    }

    public DeleteChannelResponse deleteChannelWithOptions(DeleteChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceCodes)) {
            body.put("DeviceCodes", request.deviceCodes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteChannel"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteChannelResponse());
    }

    public DeleteChannelResponse deleteChannel(DeleteChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteChannelWithOptions(request, runtime);
    }

    public DeleteCorpGroupResponse deleteCorpGroupWithOptions(DeleteCorpGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCorpGroup"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCorpGroupResponse());
    }

    public DeleteCorpGroupResponse deleteCorpGroup(DeleteCorpGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCorpGroupWithOptions(request, runtime);
    }

    public DeleteDataSourceResponse deleteDataSourceWithOptions(DeleteDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            body.put("DataSourceId", request.dataSourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataSource"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataSourceResponse());
    }

    public DeleteDataSourceResponse deleteDataSource(DeleteDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataSourceWithOptions(request, runtime);
    }

    public DeleteDataSourcesResponse deleteDataSourcesWithOptions(DeleteDataSourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceIdList)) {
            body.put("DataSourceIdList", request.dataSourceIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataSources"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataSourcesResponse());
    }

    public DeleteDataSourcesResponse deleteDataSources(DeleteDataSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataSourcesWithOptions(request, runtime);
    }

    public DeleteDeviceResponse deleteDeviceWithOptions(DeleteDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gbId)) {
            body.put("GbId", request.gbId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDevice"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeviceResponse());
    }

    public DeleteDeviceResponse deleteDevice(DeleteDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDeviceWithOptions(request, runtime);
    }

    public DeleteDeviceForInstanceResponse deleteDeviceForInstanceWithOptions(DeleteDeviceForInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteDeviceForInstanceShrinkRequest request = new DeleteDeviceForInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.devices)) {
            request.devicesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.devices, "Devices", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmId)) {
            body.put("AlgorithmId", request.algorithmId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteInstanceFlag)) {
            body.put("DeleteInstanceFlag", request.deleteInstanceFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceCount)) {
            body.put("DeviceCount", request.deviceCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devicesShrink)) {
            body.put("Devices", request.devicesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeviceForInstance"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeviceForInstanceResponse());
    }

    public DeleteDeviceForInstanceResponse deleteDeviceForInstance(DeleteDeviceForInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDeviceForInstanceWithOptions(request, runtime);
    }

    public DeleteDevicesResponse deleteDevicesWithOptions(DeleteDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceIdList)) {
            body.put("DeviceIdList", request.deviceIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDevices"),
            new TeaPair("version", "2020-05-15"),
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

    public DeleteDevicesResponse deleteDevices(DeleteDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDevicesWithOptions(request, runtime);
    }

    public DeleteDoubleVerificationGroupResponse deleteDoubleVerificationGroupWithOptions(DeleteDoubleVerificationGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.doubleVerificationGroupId)) {
            body.put("DoubleVerificationGroupId", request.doubleVerificationGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDoubleVerificationGroup"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDoubleVerificationGroupResponse());
    }

    public DeleteDoubleVerificationGroupResponse deleteDoubleVerificationGroup(DeleteDoubleVerificationGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDoubleVerificationGroupWithOptions(request, runtime);
    }

    public DeleteIPCDeviceResponse deleteIPCDeviceWithOptions(DeleteIPCDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceCodes)) {
            body.put("DeviceCodes", request.deviceCodes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIPCDevice"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIPCDeviceResponse());
    }

    public DeleteIPCDeviceResponse deleteIPCDevice(DeleteIPCDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIPCDeviceWithOptions(request, runtime);
    }

    public DeleteModelServiceResponse deleteModelServiceWithOptions(DeleteModelServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.modelServiceId)) {
            body.put("ModelServiceId", request.modelServiceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteModelService"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteModelServiceResponse());
    }

    public DeleteModelServiceResponse deleteModelService(DeleteModelServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteModelServiceWithOptions(request, runtime);
    }

    public DeleteNVRDeviceResponse deleteNVRDeviceWithOptions(DeleteNVRDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceCodes)) {
            body.put("DeviceCodes", request.deviceCodes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNVRDevice"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNVRDeviceResponse());
    }

    public DeleteNVRDeviceResponse deleteNVRDevice(DeleteNVRDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNVRDeviceWithOptions(request, runtime);
    }

    public DeleteProfileResponse deleteProfileWithOptions(DeleteProfileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvSubId)) {
            body.put("IsvSubId", request.isvSubId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profileId)) {
            body.put("ProfileId", request.profileId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProfile"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProfileResponse());
    }

    public DeleteProfileResponse deleteProfile(DeleteProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProfileWithOptions(request, runtime);
    }

    public DeleteProfileCatalogResponse deleteProfileCatalogWithOptions(DeleteProfileCatalogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvSubId)) {
            body.put("IsvSubId", request.isvSubId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProfileCatalog"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProfileCatalogResponse());
    }

    public DeleteProfileCatalogResponse deleteProfileCatalog(DeleteProfileCatalogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProfileCatalogWithOptions(request, runtime);
    }

    public DeleteProjectResponse deleteProjectWithOptions(DeleteProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectIds)) {
            query.put("ProjectIds", request.projectIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProject"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProjectResponse());
    }

    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProjectWithOptions(request, runtime);
    }

    public DeleteRecordsResponse deleteRecordsWithOptions(DeleteRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmType)) {
            body.put("AlgorithmType", request.algorithmType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attributeName)) {
            body.put("AttributeName", request.attributeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorType)) {
            body.put("OperatorType", request.operatorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            body.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRecords"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRecordsResponse());
    }

    public DeleteRecordsResponse deleteRecords(DeleteRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRecordsWithOptions(request, runtime);
    }

    public DeleteSearchTablesResponse deleteSearchTablesWithOptions(DeleteSearchTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.searchTableIds)) {
            body.put("SearchTableIds", request.searchTableIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSearchTables"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSearchTablesResponse());
    }

    public DeleteSearchTablesResponse deleteSearchTables(DeleteSearchTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSearchTablesWithOptions(request, runtime);
    }

    public DeleteSubscribeResponse deleteSubscribeWithOptions(DeleteSubscribeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("DeviceId", request.deviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSubscribe"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSubscribeResponse());
    }

    public DeleteSubscribeResponse deleteSubscribe(DeleteSubscribeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSubscribeWithOptions(request, runtime);
    }

    public DeleteUserResponse deleteUserWithOptions(DeleteUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvSubId)) {
            body.put("IsvSubId", request.isvSubId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUser"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserResponse());
    }

    public DeleteUserResponse deleteUser(DeleteUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserWithOptions(request, runtime);
    }

    public DeleteUserGroupResponse deleteUserGroupWithOptions(DeleteUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvSubId)) {
            body.put("IsvSubId", request.isvSubId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            body.put("UserGroupId", request.userGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserGroup"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserGroupResponse());
    }

    public DeleteUserGroupResponse deleteUserGroup(DeleteUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserGroupWithOptions(request, runtime);
    }

    public DeleteVideoSummaryTaskResponse deleteVideoSummaryTaskWithOptions(DeleteVideoSummaryTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVideoSummaryTask"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVideoSummaryTaskResponse());
    }

    public DeleteVideoSummaryTaskResponse deleteVideoSummaryTask(DeleteVideoSummaryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVideoSummaryTaskWithOptions(request, runtime);
    }

    public DeleteWatchPoliciesResponse deleteWatchPoliciesWithOptions(DeleteWatchPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.watchPolicyIds)) {
            body.put("WatchPolicyIds", request.watchPolicyIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWatchPolicies"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWatchPoliciesResponse());
    }

    public DeleteWatchPoliciesResponse deleteWatchPolicies(DeleteWatchPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWatchPoliciesWithOptions(request, runtime);
    }

    public DeleteWatchTasksResponse deleteWatchTasksWithOptions(DeleteWatchTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.watchTaskIds)) {
            body.put("WatchTaskIds", request.watchTaskIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWatchTasks"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWatchTasksResponse());
    }

    public DeleteWatchTasksResponse deleteWatchTasks(DeleteWatchTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWatchTasksWithOptions(request, runtime);
    }

    public DescribeAIInstanceResponse describeAIInstanceWithOptions(DescribeAIInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAIInstance"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAIInstanceResponse());
    }

    public DescribeAIInstanceResponse describeAIInstance(DescribeAIInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAIInstanceWithOptions(request, runtime);
    }

    public DescribeAiotDevicesResponse describeAiotDevicesWithOptions(DescribeAiotDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpIdList)) {
            body.put("CorpIdList", request.corpIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idList)) {
            body.put("IdList", request.idList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAiotDevices"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAiotDevicesResponse());
    }

    public DescribeAiotDevicesResponse describeAiotDevices(DescribeAiotDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAiotDevicesWithOptions(request, runtime);
    }

    public DescribeAiotPersonTableItemsResponse describeAiotPersonTableItemsWithOptions(DescribeAiotPersonTableItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personTableId)) {
            body.put("PersonTableId", request.personTableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personTableItemId)) {
            body.put("PersonTableItemId", request.personTableItemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAiotPersonTableItems"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAiotPersonTableItemsResponse());
    }

    public DescribeAiotPersonTableItemsResponse describeAiotPersonTableItems(DescribeAiotPersonTableItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAiotPersonTableItemsWithOptions(request, runtime);
    }

    public DescribeAiotPersonTablesResponse describeAiotPersonTablesWithOptions(DescribeAiotPersonTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personTableIdList)) {
            body.put("PersonTableIdList", request.personTableIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAiotPersonTables"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAiotPersonTablesResponse());
    }

    public DescribeAiotPersonTablesResponse describeAiotPersonTables(DescribeAiotPersonTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAiotPersonTablesWithOptions(request, runtime);
    }

    public DescribeAiotVehicleTableItemsResponse describeAiotVehicleTableItemsWithOptions(DescribeAiotVehicleTableItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vehicleTableId)) {
            body.put("VehicleTableId", request.vehicleTableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vehicleTableItemId)) {
            body.put("VehicleTableItemId", request.vehicleTableItemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAiotVehicleTableItems"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAiotVehicleTableItemsResponse());
    }

    public DescribeAiotVehicleTableItemsResponse describeAiotVehicleTableItems(DescribeAiotVehicleTableItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAiotVehicleTableItemsWithOptions(request, runtime);
    }

    public DescribeAiotVehicleTablesResponse describeAiotVehicleTablesWithOptions(DescribeAiotVehicleTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vehicleTableIdList)) {
            body.put("VehicleTableIdList", request.vehicleTableIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAiotVehicleTables"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAiotVehicleTablesResponse());
    }

    public DescribeAiotVehicleTablesResponse describeAiotVehicleTables(DescribeAiotVehicleTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAiotVehicleTablesWithOptions(request, runtime);
    }

    public DescribeCameraForInstanceResponse describeCameraForInstanceWithOptions(DescribeCameraForInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

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
            new TeaPair("action", "DescribeCameraForInstance"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCameraForInstanceResponse());
    }

    public DescribeCameraForInstanceResponse describeCameraForInstance(DescribeCameraForInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCameraForInstanceWithOptions(request, runtime);
    }

    public DescribeChannelsResponse describeChannelsWithOptions(DescribeChannelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceFilter)) {
            body.put("DeviceFilter", request.deviceFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceStatus)) {
            body.put("DeviceStatus", request.deviceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nvrId)) {
            body.put("NvrId", request.nvrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showUnConfig)) {
            body.put("ShowUnConfig", request.showUnConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChannels"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChannelsResponse());
    }

    public DescribeChannelsResponse describeChannels(DescribeChannelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChannelsWithOptions(request, runtime);
    }

    public DescribeDataSourcesResponse describeDataSourcesWithOptions(DescribeDataSourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpIdList)) {
            body.put("CorpIdList", request.corpIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceCategory)) {
            body.put("DataSourceCategory", request.dataSourceCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceFilter)) {
            body.put("DataSourceFilter", request.dataSourceFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceIdList)) {
            body.put("DataSourceIdList", request.dataSourceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamStatus)) {
            body.put("StreamStatus", request.streamStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataSources"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataSourcesResponse());
    }

    public DescribeDataSourcesResponse describeDataSources(DescribeDataSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataSourcesWithOptions(request, runtime);
    }

    public DescribeDevicesResponse describeDevicesWithOptions(DescribeDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpIdList)) {
            body.put("CorpIdList", request.corpIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceIdList)) {
            body.put("DeviceIdList", request.deviceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDevices"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDevicesResponse());
    }

    public DescribeDevicesResponse describeDevices(DescribeDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDevicesWithOptions(request, runtime);
    }

    public DescribeIpcsResponse describeIpcsWithOptions(DescribeIpcsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpIdList)) {
            body.put("CorpIdList", request.corpIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceFilter)) {
            body.put("DeviceFilter", request.deviceFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceIdList)) {
            body.put("DeviceIdList", request.deviceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceStatus)) {
            body.put("DeviceStatus", request.deviceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nvrIdList)) {
            body.put("NvrIdList", request.nvrIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentDeviceType)) {
            body.put("ParentDeviceType", request.parentDeviceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIpcs"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIpcsResponse());
    }

    public DescribeIpcsResponse describeIpcs(DescribeIpcsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIpcsWithOptions(request, runtime);
    }

    public DescribeModelServiceResponse describeModelServiceWithOptions(DescribeModelServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.modelServiceId)) {
            body.put("ModelServiceId", request.modelServiceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeModelService"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeModelServiceResponse());
    }

    public DescribeModelServiceResponse describeModelService(DescribeModelServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeModelServiceWithOptions(request, runtime);
    }

    public DescribeModelServiceListResponse describeModelServiceListWithOptions(DescribeModelServiceListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmCode)) {
            body.put("AlgorithmCode", request.algorithmCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeDeleted)) {
            body.put("IncludeDeleted", request.includeDeleted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelServiceName)) {
            body.put("ModelServiceName", request.modelServiceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeModelServiceList"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeModelServiceListResponse());
    }

    public DescribeModelServiceListResponse describeModelServiceList(DescribeModelServiceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeModelServiceListWithOptions(request, runtime);
    }

    /**
      * @deprecated
      *
      * @param request DescribeNvrDevicesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeNvrDevicesResponse
     */
    // Deprecated
    public DescribeNvrDevicesResponse describeNvrDevicesWithOptions(DescribeNvrDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpIdList)) {
            body.put("CorpIdList", request.corpIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceFilter)) {
            body.put("DeviceFilter", request.deviceFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nvrDeviceIdList)) {
            body.put("NvrDeviceIdList", request.nvrDeviceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNvrDevices"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNvrDevicesResponse());
    }

    /**
      * @deprecated
      *
      * @param request DescribeNvrDevicesRequest
      * @return DescribeNvrDevicesResponse
     */
    // Deprecated
    public DescribeNvrDevicesResponse describeNvrDevices(DescribeNvrDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNvrDevicesWithOptions(request, runtime);
    }

    public DescribeNvrsResponse describeNvrsWithOptions(DescribeNvrsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpIdList)) {
            body.put("CorpIdList", request.corpIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceFilter)) {
            body.put("DeviceFilter", request.deviceFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nvrDeviceIdList)) {
            body.put("NvrDeviceIdList", request.nvrDeviceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNvrs"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNvrsResponse());
    }

    public DescribeNvrsResponse describeNvrs(DescribeNvrsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNvrsWithOptions(request, runtime);
    }

    public DescribeSearchItemsResponse describeSearchItemsWithOptions(DescribeSearchItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchItemIds)) {
            body.put("SearchItemIds", request.searchItemIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchTableId)) {
            body.put("SearchTableId", request.searchTableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSearchItems"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSearchItemsResponse());
    }

    public DescribeSearchItemsResponse describeSearchItems(DescribeSearchItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSearchItemsWithOptions(request, runtime);
    }

    public DescribeSearchTablesResponse describeSearchTablesWithOptions(DescribeSearchTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchTableIds)) {
            body.put("SearchTableIds", request.searchTableIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSearchTables"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSearchTablesResponse());
    }

    public DescribeSearchTablesResponse describeSearchTables(DescribeSearchTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSearchTablesWithOptions(request, runtime);
    }

    public DescribeWatchItemsResponse describeWatchItemsWithOptions(DescribeWatchItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watchItemIds)) {
            body.put("WatchItemIds", request.watchItemIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watchPolicyId)) {
            body.put("WatchPolicyId", request.watchPolicyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWatchItems"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWatchItemsResponse());
    }

    public DescribeWatchItemsResponse describeWatchItems(DescribeWatchItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWatchItemsWithOptions(request, runtime);
    }

    public DescribeWatchPoliciesResponse describeWatchPoliciesWithOptions(DescribeWatchPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watchPolicyIds)) {
            body.put("WatchPolicyIds", request.watchPolicyIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWatchPolicies"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWatchPoliciesResponse());
    }

    public DescribeWatchPoliciesResponse describeWatchPolicies(DescribeWatchPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWatchPoliciesWithOptions(request, runtime);
    }

    public DescribeWatchTasksResponse describeWatchTasksWithOptions(DescribeWatchTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watchTaskIds)) {
            body.put("WatchTaskIds", request.watchTaskIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWatchTasks"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWatchTasksResponse());
    }

    public DescribeWatchTasksResponse describeWatchTasks(DescribeWatchTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWatchTasksWithOptions(request, runtime);
    }

    public DescribesDoubleVerificationGroupsResponse describesDoubleVerificationGroupsWithOptions(DescribesDoubleVerificationGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.doubleVerificationGroupIds)) {
            body.put("DoubleVerificationGroupIds", request.doubleVerificationGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribesDoubleVerificationGroups"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribesDoubleVerificationGroupsResponse());
    }

    public DescribesDoubleVerificationGroupsResponse describesDoubleVerificationGroups(DescribesDoubleVerificationGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describesDoubleVerificationGroupsWithOptions(request, runtime);
    }

    public EchoStatusResponse echoStatusWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EchoStatus"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EchoStatusResponse());
    }

    public EchoStatusResponse echoStatus() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.echoStatusWithOptions(runtime);
    }

    public GetAiotStorageInfoResponse getAiotStorageInfoWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAiotStorageInfo"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAiotStorageInfoResponse());
    }

    public GetAiotStorageInfoResponse getAiotStorageInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAiotStorageInfoWithOptions(runtime);
    }

    /**
      * @deprecated
      *
      * @param request GetBodyOptionsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetBodyOptionsResponse
     */
    // Deprecated
    public GetBodyOptionsResponse getBodyOptionsWithOptions(GetBodyOptionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBodyOptions"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBodyOptionsResponse());
    }

    /**
      * @deprecated
      *
      * @param request GetBodyOptionsRequest
      * @return GetBodyOptionsResponse
     */
    // Deprecated
    public GetBodyOptionsResponse getBodyOptions(GetBodyOptionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBodyOptionsWithOptions(request, runtime);
    }

    public GetCatalogListResponse getCatalogListWithOptions(GetCatalogListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            query.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvSubId)) {
            query.put("IsvSubId", request.isvSubId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCatalogList"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCatalogListResponse());
    }

    public GetCatalogListResponse getCatalogList(GetCatalogListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCatalogListWithOptions(request, runtime);
    }

    public GetCityCodeResponse getCityCodeWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCityCode"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCityCodeResponse());
    }

    public GetCityCodeResponse getCityCode() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCityCodeWithOptions(runtime);
    }

    public GetDataSourceStatsResponse getDataSourceStatsWithOptions(GetDataSourceStatsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpIdList)) {
            body.put("CorpIdList", request.corpIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataSourceStats"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataSourceStatsResponse());
    }

    public GetDataSourceStatsResponse getDataSourceStats(GetDataSourceStatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataSourceStatsWithOptions(request, runtime);
    }

    public GetDeviceCaptureStrategyResponse getDeviceCaptureStrategyWithOptions(GetDeviceCaptureStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceCode)) {
            body.put("DeviceCode", request.deviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceType)) {
            body.put("DeviceType", request.deviceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceCaptureStrategy"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceCaptureStrategyResponse());
    }

    public GetDeviceCaptureStrategyResponse getDeviceCaptureStrategy(GetDeviceCaptureStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeviceCaptureStrategyWithOptions(request, runtime);
    }

    public GetDeviceConfigResponse getDeviceConfigWithOptions(GetDeviceConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceSn)) {
            body.put("DeviceSn", request.deviceSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceTimeStamp)) {
            body.put("DeviceTimeStamp", request.deviceTimeStamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceConfig"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceConfigResponse());
    }

    public GetDeviceConfigResponse getDeviceConfig(GetDeviceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeviceConfigWithOptions(request, runtime);
    }

    public GetDeviceCountResponse getDeviceCountWithOptions(GetDeviceCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.upStreamMode)) {
            body.put("UpStreamMode", request.upStreamMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceCount"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceCountResponse());
    }

    public GetDeviceCountResponse getDeviceCount(GetDeviceCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeviceCountWithOptions(request, runtime);
    }

    public GetDeviceLiveUrlResponse getDeviceLiveUrlWithOptions(GetDeviceLiveUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gbId)) {
            body.put("GbId", request.gbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outProtocol)) {
            body.put("OutProtocol", request.outProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamType)) {
            body.put("StreamType", request.streamType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceLiveUrl"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceLiveUrlResponse());
    }

    public GetDeviceLiveUrlResponse getDeviceLiveUrl(GetDeviceLiveUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeviceLiveUrlWithOptions(request, runtime);
    }

    public GetDevicePictureResponse getDevicePictureWithOptions(GetDevicePictureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("DeviceId", request.deviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDevicePicture"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDevicePictureResponse());
    }

    public GetDevicePictureResponse getDevicePicture(GetDevicePictureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDevicePictureWithOptions(request, runtime);
    }

    public GetDeviceStatsResponse getDeviceStatsWithOptions(GetDeviceStatsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpIdList)) {
            body.put("CorpIdList", request.corpIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceStatus)) {
            body.put("DeviceStatus", request.deviceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceType)) {
            body.put("DeviceType", request.deviceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceStats"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceStatsResponse());
    }

    public GetDeviceStatsResponse getDeviceStats(GetDeviceStatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeviceStatsWithOptions(request, runtime);
    }

    public GetDeviceVideoUrlResponse getDeviceVideoUrlWithOptions(GetDeviceVideoUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gbId)) {
            body.put("GbId", request.gbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outProtocol)) {
            body.put("OutProtocol", request.outProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            body.put("StorageType", request.storageType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceVideoUrl"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceVideoUrlResponse());
    }

    public GetDeviceVideoUrlResponse getDeviceVideoUrl(GetDeviceVideoUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeviceVideoUrlWithOptions(request, runtime);
    }

    public GetFaceModelResultResponse getFaceModelResultWithOptions(GetFaceModelResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pictureContent)) {
            body.put("PictureContent", request.pictureContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pictureId)) {
            body.put("PictureId", request.pictureId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pictureUrl)) {
            body.put("PictureUrl", request.pictureUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFaceModelResult"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFaceModelResultResponse());
    }

    public GetFaceModelResultResponse getFaceModelResult(GetFaceModelResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFaceModelResultWithOptions(request, runtime);
    }

    /**
      * @deprecated
      *
      * @param request GetFaceOptionsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetFaceOptionsResponse
     */
    // Deprecated
    public GetFaceOptionsResponse getFaceOptionsWithOptions(GetFaceOptionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFaceOptions"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFaceOptionsResponse());
    }

    /**
      * @deprecated
      *
      * @param request GetFaceOptionsRequest
      * @return GetFaceOptionsResponse
     */
    // Deprecated
    public GetFaceOptionsResponse getFaceOptions(GetFaceOptionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFaceOptionsWithOptions(request, runtime);
    }

    public GetInventoryResponse getInventoryWithOptions(GetInventoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            body.put("CommodityCode", request.commodityCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInventory"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInventoryResponse());
    }

    public GetInventoryResponse getInventory(GetInventoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInventoryWithOptions(request, runtime);
    }

    public GetMonitorListResponse getMonitorListWithOptions(GetMonitorListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

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
            new TeaPair("action", "GetMonitorList"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMonitorListResponse());
    }

    public GetMonitorListResponse getMonitorList(GetMonitorListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMonitorListWithOptions(request, runtime);
    }

    public GetMonitorResultResponse getMonitorResultWithOptions(GetMonitorResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmVendor)) {
            body.put("AlgorithmVendor", request.algorithmVendor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minRecordId)) {
            body.put("MinRecordId", request.minRecordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMonitorResult"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMonitorResultResponse());
    }

    public GetMonitorResultResponse getMonitorResult(GetMonitorResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMonitorResultWithOptions(request, runtime);
    }

    public GetOdpsResultResponse getOdpsResultWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOdpsResult"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOdpsResultResponse());
    }

    public GetOdpsResultResponse getOdpsResult() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOdpsResultWithOptions(runtime);
    }

    public GetPersonDetailResponse getPersonDetailWithOptions(GetPersonDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmType)) {
            body.put("AlgorithmType", request.algorithmType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personID)) {
            body.put("PersonID", request.personID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPersonDetail"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPersonDetailResponse());
    }

    public GetPersonDetailResponse getPersonDetail(GetPersonDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPersonDetailWithOptions(request, runtime);
    }

    public GetPersonListResponse getPersonListWithOptions(GetPersonListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetPersonListShrinkRequest request = new GetPersonListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.corpIdList)) {
            request.corpIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.corpIdList, "CorpIdList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.personIdList)) {
            request.personIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.personIdList, "PersonIdList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpIdListShrink)) {
            body.put("CorpIdList", request.corpIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceMatchingRateThreshold)) {
            body.put("FaceMatchingRateThreshold", request.faceMatchingRateThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceUrl)) {
            body.put("FaceUrl", request.faceUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personIdListShrink)) {
            body.put("PersonIdList", request.personIdListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPersonList"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPersonListResponse());
    }

    public GetPersonListResponse getPersonList(GetPersonListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPersonListWithOptions(request, runtime);
    }

    public GetPictureUrlResponse getPictureUrlWithOptions(GetPictureUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            body.put("ExpireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originUrl)) {
            body.put("OriginUrl", request.originUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            body.put("Protocol", request.protocol);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPictureUrl"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPictureUrlResponse());
    }

    public GetPictureUrlResponse getPictureUrl(GetPictureUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPictureUrlWithOptions(request, runtime);
    }

    public GetProfileDetailResponse getProfileDetailWithOptions(GetProfileDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvSubId)) {
            body.put("IsvSubId", request.isvSubId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profileId)) {
            body.put("ProfileId", request.profileId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProfileDetail"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProfileDetailResponse());
    }

    public GetProfileDetailResponse getProfileDetail(GetProfileDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProfileDetailWithOptions(request, runtime);
    }

    public GetProfileListResponse getProfileListWithOptions(GetProfileListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetProfileListShrinkRequest request = new GetProfileListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.personIdList)) {
            request.personIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.personIdList, "PersonIdList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.profileIdList)) {
            request.profileIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.profileIdList, "ProfileIdList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceImageId)) {
            body.put("FaceImageId", request.faceImageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceUrl)) {
            body.put("FaceUrl", request.faceUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gender)) {
            body.put("Gender", request.gender);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idNumber)) {
            body.put("IdNumber", request.idNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvSubId)) {
            body.put("IsvSubId", request.isvSubId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveAddress)) {
            body.put("LiveAddress", request.liveAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchingRateThreshold)) {
            body.put("MatchingRateThreshold", request.matchingRateThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personIdListShrink)) {
            body.put("PersonIdList", request.personIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNo)) {
            body.put("PhoneNo", request.phoneNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plateNo)) {
            body.put("PlateNo", request.plateNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profileIdListShrink)) {
            body.put("ProfileIdList", request.profileIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneType)) {
            body.put("SceneType", request.sceneType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProfileList"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProfileListResponse());
    }

    public GetProfileListResponse getProfileList(GetProfileListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProfileListWithOptions(request, runtime);
    }

    public GetScanSubDevicesResponse getScanSubDevicesWithOptions(GetScanSubDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("DeviceId", request.deviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetScanSubDevices"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetScanSubDevicesResponse());
    }

    public GetScanSubDevicesResponse getScanSubDevices(GetScanSubDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getScanSubDevicesWithOptions(request, runtime);
    }

    public GetUserDetailResponse getUserDetailWithOptions(GetUserDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvSubId)) {
            body.put("IsvSubId", request.isvSubId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needFaceDetail)) {
            body.put("NeedFaceDetail", request.needFaceDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserDetail"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserDetailResponse());
    }

    public GetUserDetailResponse getUserDetail(GetUserDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserDetailWithOptions(request, runtime);
    }

    public GetVideoComposeResultResponse getVideoComposeResultWithOptions(GetVideoComposeResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskRequestId)) {
            body.put("TaskRequestId", request.taskRequestId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVideoComposeResult"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVideoComposeResultResponse());
    }

    public GetVideoComposeResultResponse getVideoComposeResult(GetVideoComposeResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoComposeResultWithOptions(request, runtime);
    }

    public GetVideoSummaryTaskResultResponse getVideoSummaryTaskResultWithOptions(GetVideoSummaryTaskResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVideoSummaryTaskResult"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVideoSummaryTaskResultResponse());
    }

    public GetVideoSummaryTaskResultResponse getVideoSummaryTaskResult(GetVideoSummaryTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoSummaryTaskResultWithOptions(request, runtime);
    }

    public InvokeMotorModelResponse invokeMotorModelWithOptions(InvokeMotorModelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picId)) {
            body.put("PicId", request.picId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picPath)) {
            body.put("PicPath", request.picPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picUrl)) {
            body.put("PicUrl", request.picUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvokeMotorModel"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvokeMotorModelResponse());
    }

    public InvokeMotorModelResponse invokeMotorModel(InvokeMotorModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.invokeMotorModelWithOptions(request, runtime);
    }

    public ListAccessNumberResponse listAccessNumberWithOptions(ListAccessNumberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpIdList)) {
            body.put("CorpIdList", request.corpIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAccessNumber"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAccessNumberResponse());
    }

    public ListAccessNumberResponse listAccessNumber(ListAccessNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAccessNumberWithOptions(request, runtime);
    }

    public ListAlgorithmNamesByDeviceIdsResponse listAlgorithmNamesByDeviceIdsWithOptions(ListAlgorithmNamesByDeviceIdsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlgorithmNamesByDeviceIds"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlgorithmNamesByDeviceIdsResponse());
    }

    public ListAlgorithmNamesByDeviceIdsResponse listAlgorithmNamesByDeviceIds(ListAlgorithmNamesByDeviceIdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAlgorithmNamesByDeviceIdsWithOptions(request, runtime);
    }

    public ListBodyAlgorithmResultsResponse listBodyAlgorithmResultsWithOptions(ListBodyAlgorithmResultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmType)) {
            body.put("AlgorithmType", request.algorithmType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.capStyle)) {
            body.put("CapStyle", request.capStyle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            body.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBodyAlgorithmResults"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBodyAlgorithmResultsResponse());
    }

    public ListBodyAlgorithmResultsResponse listBodyAlgorithmResults(ListBodyAlgorithmResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBodyAlgorithmResultsWithOptions(request, runtime);
    }

    public ListCorpGroupMetricsResponse listCorpGroupMetricsWithOptions(ListCorpGroupMetricsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroup)) {
            body.put("DeviceGroup", request.deviceGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagCode)) {
            body.put("TagCode", request.tagCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroup)) {
            body.put("UserGroup", request.userGroup);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCorpGroupMetrics"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCorpGroupMetricsResponse());
    }

    public ListCorpGroupMetricsResponse listCorpGroupMetrics(ListCorpGroupMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCorpGroupMetricsWithOptions(request, runtime);
    }

    public ListCorpGroupsResponse listCorpGroupsWithOptions(ListCorpGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

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
            new TeaPair("action", "ListCorpGroups"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCorpGroupsResponse());
    }

    public ListCorpGroupsResponse listCorpGroups(ListCorpGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCorpGroupsWithOptions(request, runtime);
    }

    public ListCorpMetricsResponse listCorpMetricsWithOptions(ListCorpMetricsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupList)) {
            body.put("DeviceGroupList", request.deviceGroupList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceIdList)) {
            body.put("DeviceIdList", request.deviceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagCode)) {
            body.put("TagCode", request.tagCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupList)) {
            body.put("UserGroupList", request.userGroupList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCorpMetrics"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCorpMetricsResponse());
    }

    public ListCorpMetricsResponse listCorpMetrics(ListCorpMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCorpMetricsWithOptions(request, runtime);
    }

    public ListCorpsResponse listCorpsWithOptions(ListCorpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpName)) {
            body.put("CorpName", request.corpName);
        }

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
            new TeaPair("action", "ListCorps"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCorpsResponse());
    }

    public ListCorpsResponse listCorps(ListCorpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCorpsWithOptions(request, runtime);
    }

    public ListDeviceGroupsResponse listDeviceGroupsWithOptions(ListDeviceGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpIdList)) {
            body.put("CorpIdList", request.corpIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceCodeList)) {
            body.put("DeviceCodeList", request.deviceCodeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            body.put("Group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isPage)) {
            body.put("IsPage", request.isPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeviceGroups"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeviceGroupsResponse());
    }

    public ListDeviceGroupsResponse listDeviceGroups(ListDeviceGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeviceGroupsWithOptions(request, runtime);
    }

    /**
      * ****
      *
      * @param request ListDevicesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListDevicesResponse
     */
    public ListDevicesResponse listDevicesWithOptions(ListDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gbId)) {
            body.put("GbId", request.gbId);
        }

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
            new TeaPair("action", "ListDevices"),
            new TeaPair("version", "2020-05-15"),
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
      * ****
      *
      * @param request ListDevicesRequest
      * @return ListDevicesResponse
     */
    public ListDevicesResponse listDevices(ListDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDevicesWithOptions(request, runtime);
    }

    public ListEventAlgorithmDetailsResponse listEventAlgorithmDetailsWithOptions(ListEventAlgorithmDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            body.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            body.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventValue)) {
            body.put("EventValue", request.eventValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendValue)) {
            body.put("ExtendValue", request.extendValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            body.put("RecordId", request.recordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            body.put("SourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEventAlgorithmDetails"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEventAlgorithmDetailsResponse());
    }

    public ListEventAlgorithmDetailsResponse listEventAlgorithmDetails(ListEventAlgorithmDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEventAlgorithmDetailsWithOptions(request, runtime);
    }

    public ListEventAlgorithmResultsResponse listEventAlgorithmResultsWithOptions(ListEventAlgorithmResultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            body.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            body.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendValue)) {
            body.put("ExtendValue", request.extendValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEventAlgorithmResults"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEventAlgorithmResultsResponse());
    }

    public ListEventAlgorithmResultsResponse listEventAlgorithmResults(ListEventAlgorithmResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEventAlgorithmResultsWithOptions(request, runtime);
    }

    public ListFaceAlgorithmResultsResponse listFaceAlgorithmResultsWithOptions(ListFaceAlgorithmResultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmType)) {
            body.put("AlgorithmType", request.algorithmType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            body.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFaceAlgorithmResults"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFaceAlgorithmResultsResponse());
    }

    public ListFaceAlgorithmResultsResponse listFaceAlgorithmResults(ListFaceAlgorithmResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFaceAlgorithmResultsWithOptions(request, runtime);
    }

    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstances"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesResponse());
    }

    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstancesWithOptions(request, runtime);
    }

    public ListMetricsResponse listMetricsWithOptions(ListMetricsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregateType)) {
            body.put("AggregateType", request.aggregateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagCode)) {
            body.put("TagCode", request.tagCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMetrics"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMetricsResponse());
    }

    public ListMetricsResponse listMetrics(ListMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMetricsWithOptions(request, runtime);
    }

    public ListMotorAlgorithmResultsResponse listMotorAlgorithmResultsWithOptions(ListMotorAlgorithmResultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmType)) {
            body.put("AlgorithmType", request.algorithmType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            body.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plateNumber)) {
            body.put("PlateNumber", request.plateNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMotorAlgorithmResults"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMotorAlgorithmResultsResponse());
    }

    public ListMotorAlgorithmResultsResponse listMotorAlgorithmResults(ListMotorAlgorithmResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMotorAlgorithmResultsWithOptions(request, runtime);
    }

    public ListNVRChannelDeviceResponse listNVRChannelDeviceWithOptions(ListNVRChannelDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceCode)) {
            body.put("DeviceCode", request.deviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isPage)) {
            body.put("IsPage", request.isPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNVRChannelDevice"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNVRChannelDeviceResponse());
    }

    public ListNVRChannelDeviceResponse listNVRChannelDevice(ListNVRChannelDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNVRChannelDeviceWithOptions(request, runtime);
    }

    public ListNVRDeviceResponse listNVRDeviceWithOptions(ListNVRDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpIdList)) {
            body.put("CorpIdList", request.corpIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceCode)) {
            body.put("DeviceCode", request.deviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isPage)) {
            body.put("IsPage", request.isPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNVRDevice"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNVRDeviceResponse());
    }

    public ListNVRDeviceResponse listNVRDevice(ListNVRDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNVRDeviceWithOptions(request, runtime);
    }

    public ListPersonTraceResponse listPersonTraceWithOptions(ListPersonTraceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            body.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personId)) {
            body.put("PersonId", request.personId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPersonTrace"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPersonTraceResponse());
    }

    public ListPersonTraceResponse listPersonTrace(ListPersonTraceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPersonTraceWithOptions(request, runtime);
    }

    public ListPersonTraceDetailsResponse listPersonTraceDetailsWithOptions(ListPersonTraceDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            body.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personId)) {
            body.put("PersonId", request.personId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subId)) {
            body.put("SubId", request.subId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPersonTraceDetails"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPersonTraceDetailsResponse());
    }

    public ListPersonTraceDetailsResponse listPersonTraceDetails(ListPersonTraceDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPersonTraceDetailsWithOptions(request, runtime);
    }

    public ListPersonVisitCountResponse listPersonVisitCountWithOptions(ListPersonVisitCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregateType)) {
            body.put("AggregateType", request.aggregateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.countType)) {
            body.put("CountType", request.countType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxVal)) {
            body.put("MaxVal", request.maxVal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minVal)) {
            body.put("MinVal", request.minVal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagCode)) {
            body.put("TagCode", request.tagCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeAggregateType)) {
            body.put("TimeAggregateType", request.timeAggregateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPersonVisitCount"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPersonVisitCountResponse());
    }

    public ListPersonVisitCountResponse listPersonVisitCount(ListPersonVisitCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPersonVisitCountWithOptions(request, runtime);
    }

    public ListPersonsResponse listPersonsWithOptions(ListPersonsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmType)) {
            body.put("AlgorithmType", request.algorithmType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            body.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPersons"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPersonsResponse());
    }

    public ListPersonsResponse listPersons(ListPersonsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPersonsWithOptions(request, runtime);
    }

    public ListUserGroupsResponse listUserGroupsWithOptions(ListUserGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            query.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvSubId)) {
            query.put("IsvSubId", request.isvSubId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserGroups"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserGroupsResponse());
    }

    public ListUserGroupsResponse listUserGroups(ListUserGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserGroupsWithOptions(request, runtime);
    }

    public ListUsersResponse listUsersWithOptions(ListUsersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListUsersShrinkRequest request = new ListUsersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.personList)) {
            request.personListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.personList, "PersonList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userList)) {
            request.userListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userList, "UserList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            body.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.age)) {
            body.put("Age", request.age);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attachment)) {
            body.put("Attachment", request.attachment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceImageUrl)) {
            body.put("FaceImageUrl", request.faceImageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gender)) {
            body.put("Gender", request.gender);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idNumber)) {
            body.put("IdNumber", request.idNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvSubId)) {
            body.put("IsvSubId", request.isvSubId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchingRateThreshold)) {
            body.put("MatchingRateThreshold", request.matchingRateThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personListShrink)) {
            body.put("PersonList", request.personListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNo)) {
            body.put("PhoneNo", request.phoneNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plateNo)) {
            body.put("PlateNo", request.plateNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            body.put("UserGroupId", request.userGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userListShrink)) {
            body.put("UserList", request.userListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsers"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsersResponse());
    }

    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    public ModifyDeviceResponse modifyDeviceWithOptions(ModifyDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.audioEnable)) {
            body.put("AudioEnable", request.audioEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceAddress)) {
            body.put("DeviceAddress", request.deviceAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceDirection)) {
            body.put("DeviceDirection", request.deviceDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceIp)) {
            body.put("DeviceIp", request.deviceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceModel)) {
            body.put("DeviceModel", request.deviceModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceRate)) {
            body.put("DeviceRate", request.deviceRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceResolution)) {
            body.put("DeviceResolution", request.deviceResolution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceSite)) {
            body.put("DeviceSite", request.deviceSite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceSubType)) {
            body.put("DeviceSubType", request.deviceSubType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encodeFormat)) {
            body.put("EncodeFormat", request.encodeFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frameRate)) {
            body.put("FrameRate", request.frameRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.govLength)) {
            body.put("GovLength", request.govLength);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.latitude)) {
            body.put("Latitude", request.latitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.longitude)) {
            body.put("Longitude", request.longitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OSDTimeEnable)) {
            body.put("OSDTimeEnable", request.OSDTimeEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OSDTimeType)) {
            body.put("OSDTimeType", request.OSDTimeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OSDTimeX)) {
            body.put("OSDTimeX", request.OSDTimeX);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OSDTimeY)) {
            body.put("OSDTimeY", request.OSDTimeY);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roi)) {
            body.put("Roi", request.roi);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendor)) {
            body.put("Vendor", request.vendor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDevice"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDeviceResponse());
    }

    public ModifyDeviceResponse modifyDevice(ModifyDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDeviceWithOptions(request, runtime);
    }

    public PeekNvrResponse peekNvrWithOptions(PeekNvrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("DeviceId", request.deviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PeekNvr"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PeekNvrResponse());
    }

    public PeekNvrResponse peekNvr(PeekNvrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.peekNvrWithOptions(request, runtime);
    }

    public RaiseDevicesStorageResponse raiseDevicesStorageWithOptions(RaiseDevicesStorageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.json)) {
            body.put("Json", request.json);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RaiseDevicesStorage"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RaiseDevicesStorageResponse());
    }

    public RaiseDevicesStorageResponse raiseDevicesStorage(RaiseDevicesStorageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.raiseDevicesStorageWithOptions(request, runtime);
    }

    public RecognizeFaceQualityResponse recognizeFaceQualityWithOptions(RecognizeFaceQualityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picContent)) {
            body.put("PicContent", request.picContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picFormat)) {
            body.put("PicFormat", request.picFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picUrl)) {
            body.put("PicUrl", request.picUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeFaceQuality"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeFaceQualityResponse());
    }

    public RecognizeFaceQualityResponse recognizeFaceQuality(RecognizeFaceQualityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeFaceQualityWithOptions(request, runtime);
    }

    public RecognizeImageResponse recognizeImageWithOptions(RecognizeImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picContent)) {
            body.put("PicContent", request.picContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picFormat)) {
            body.put("PicFormat", request.picFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picUrl)) {
            body.put("PicUrl", request.picUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeImage"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeImageResponse());
    }

    public RecognizeImageResponse recognizeImage(RecognizeImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeImageWithOptions(request, runtime);
    }

    public RegisterDeviceResponse registerDeviceWithOptions(RegisterDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceSn)) {
            body.put("DeviceSn", request.deviceSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceTimeStamp)) {
            body.put("DeviceTimeStamp", request.deviceTimeStamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            body.put("ServerId", request.serverId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterDevice"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterDeviceResponse());
    }

    public RegisterDeviceResponse registerDevice(RegisterDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerDeviceWithOptions(request, runtime);
    }

    public RemoveCameraForInstanceResponse removeCameraForInstanceWithOptions(RemoveCameraForInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveCameraForInstanceShrinkRequest request = new RemoveCameraForInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.cameraIds)) {
            request.cameraIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.cameraIds, "CameraIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cameraIdsShrink)) {
            body.put("CameraIds", request.cameraIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveCameraForInstance"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveCameraForInstanceResponse());
    }

    public RemoveCameraForInstanceResponse removeCameraForInstance(RemoveCameraForInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeCameraForInstanceWithOptions(request, runtime);
    }

    public RemoveSearchItemsResponse removeSearchItemsWithOptions(RemoveSearchItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.searchItemIds)) {
            body.put("SearchItemIds", request.searchItemIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchTableId)) {
            body.put("SearchTableId", request.searchTableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveSearchItems"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveSearchItemsResponse());
    }

    public RemoveSearchItemsResponse removeSearchItems(RemoveSearchItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeSearchItemsWithOptions(request, runtime);
    }

    public RemoveWatchItemsResponse removeWatchItemsWithOptions(RemoveWatchItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.watchItemIds)) {
            body.put("WatchItemIds", request.watchItemIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watchPolicyId)) {
            body.put("WatchPolicyId", request.watchPolicyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveWatchItems"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveWatchItemsResponse());
    }

    public RemoveWatchItemsResponse removeWatchItems(RemoveWatchItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeWatchItemsWithOptions(request, runtime);
    }

    public SaveVideoSummaryTaskVideoResponse saveVideoSummaryTaskVideoWithOptions(SaveVideoSummaryTaskVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saveVideo)) {
            body.put("SaveVideo", request.saveVideo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveVideoSummaryTaskVideo"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveVideoSummaryTaskVideoResponse());
    }

    public SaveVideoSummaryTaskVideoResponse saveVideoSummaryTaskVideo(SaveVideoSummaryTaskVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveVideoSummaryTaskVideoWithOptions(request, runtime);
    }

    public ScanSubDeviceResponse scanSubDeviceWithOptions(ScanSubDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("DeviceId", request.deviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScanSubDevice"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScanSubDeviceResponse());
    }

    public ScanSubDeviceResponse scanSubDevice(ScanSubDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.scanSubDeviceWithOptions(request, runtime);
    }

    public SearchBodyResponse searchBodyWithOptions(SearchBodyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SearchBodyShrinkRequest request = new SearchBodyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.optionList)) {
            request.optionListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.optionList, "OptionList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTimeStamp)) {
            body.put("EndTimeStamp", request.endTimeStamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gbId)) {
            body.put("GbId", request.gbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optionListShrink)) {
            body.put("OptionList", request.optionListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            body.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimeStamp)) {
            body.put("StartTimeStamp", request.startTimeStamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchBody"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchBodyResponse());
    }

    public SearchBodyResponse searchBody(SearchBodyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchBodyWithOptions(request, runtime);
    }

    public SearchFaceResponse searchFaceWithOptions(SearchFaceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SearchFaceShrinkRequest request = new SearchFaceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.optionList)) {
            request.optionListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.optionList, "OptionList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTimeStamp)) {
            body.put("EndTimeStamp", request.endTimeStamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gbId)) {
            body.put("GbId", request.gbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optionListShrink)) {
            body.put("OptionList", request.optionListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            body.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimeStamp)) {
            body.put("StartTimeStamp", request.startTimeStamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchFace"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchFaceResponse());
    }

    public SearchFaceResponse searchFace(SearchFaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchFaceWithOptions(request, runtime);
    }

    public SearchItemResponse searchItemWithOptions(SearchItemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.itemImageData)) {
            body.put("ItemImageData", request.itemImageData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemImageUrl)) {
            body.put("ItemImageUrl", request.itemImageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchTableIds)) {
            body.put("SearchTableIds", request.searchTableIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.similarityThreshold)) {
            body.put("SimilarityThreshold", request.similarityThreshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchItem"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchItemResponse());
    }

    public SearchItemResponse searchItem(SearchItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchItemWithOptions(request, runtime);
    }

    public SearchObjectResponse searchObjectWithOptions(SearchObjectRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SearchObjectShrinkRequest request = new SearchObjectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.conditions)) {
            request.conditionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.conditions, "Conditions", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceList)) {
            request.deviceListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceList, "DeviceList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.imagePath)) {
            request.imagePathShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.imagePath, "ImagePath", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmType)) {
            body.put("AlgorithmType", request.algorithmType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conditionsShrink)) {
            body.put("Conditions", request.conditionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceListShrink)) {
            body.put("DeviceList", request.deviceListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imagePathShrink)) {
            body.put("ImagePath", request.imagePathShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectType)) {
            body.put("ObjectType", request.objectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picUrl)) {
            body.put("PicUrl", request.picUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchObject"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchObjectResponse());
    }

    public SearchObjectResponse searchObject(SearchObjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchObjectWithOptions(request, runtime);
    }

    public SearchTargetResponse searchTargetWithOptions(SearchTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            body.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceList)) {
            body.put("DeviceList", request.deviceList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            body.put("ModelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            body.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.similarityThreshold)) {
            body.put("SimilarityThreshold", request.similarityThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetAttributes)) {
            body.put("TargetAttributes", request.targetAttributes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetImageData)) {
            body.put("TargetImageData", request.targetImageData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetImageUrl)) {
            body.put("TargetImageUrl", request.targetImageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            body.put("TargetType", request.targetType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchTarget"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchTargetResponse());
    }

    public SearchTargetResponse searchTarget(SearchTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchTargetWithOptions(request, runtime);
    }

    public SetAiotStorageInfoResponse setAiotStorageInfoWithOptions(SetAiotStorageInfoRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetAiotStorageInfoShrinkRequest request = new SetAiotStorageInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.eventAlarmMq)) {
            request.eventAlarmMqShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.eventAlarmMq, "EventAlarmMq", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.eventAlarmPictureStorage)) {
            request.eventAlarmPictureStorageShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.eventAlarmPictureStorage, "EventAlarmPictureStorage", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventAlarmMqShrink)) {
            body.put("EventAlarmMq", request.eventAlarmMqShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventAlarmPictureStorageShrink)) {
            body.put("EventAlarmPictureStorage", request.eventAlarmPictureStorageShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetAiotStorageInfo"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetAiotStorageInfoResponse());
    }

    public SetAiotStorageInfoResponse setAiotStorageInfo(SetAiotStorageInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setAiotStorageInfoWithOptions(request, runtime);
    }

    public SetStreamModeResponse setStreamModeWithOptions(SetStreamModeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceIdList)) {
            body.put("DeviceIdList", request.deviceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamMode)) {
            body.put("StreamMode", request.streamMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetStreamMode"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetStreamModeResponse());
    }

    public SetStreamModeResponse setStreamMode(SetStreamModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setStreamModeWithOptions(request, runtime);
    }

    public StartModelServiceResponse startModelServiceWithOptions(StartModelServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.modelServiceId)) {
            body.put("ModelServiceId", request.modelServiceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartModelService"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartModelServiceResponse());
    }

    public StartModelServiceResponse startModelService(StartModelServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startModelServiceWithOptions(request, runtime);
    }

    public StartStreamsResponse startStreamsWithOptions(StartStreamsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceIdList)) {
            body.put("DeviceIdList", request.deviceIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartStreams"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartStreamsResponse());
    }

    public StartStreamsResponse startStreams(StartStreamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startStreamsWithOptions(request, runtime);
    }

    public StopModelServiceResponse stopModelServiceWithOptions(StopModelServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.modelServiceId)) {
            body.put("ModelServiceId", request.modelServiceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopModelService"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopModelServiceResponse());
    }

    public StopModelServiceResponse stopModelService(StopModelServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopModelServiceWithOptions(request, runtime);
    }

    public StopMonitorResponse stopMonitorWithOptions(StopMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmVendor)) {
            body.put("AlgorithmVendor", request.algorithmVendor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopMonitor"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopMonitorResponse());
    }

    public StopMonitorResponse stopMonitor(StopMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopMonitorWithOptions(request, runtime);
    }

    public StopStreamsResponse stopStreamsWithOptions(StopStreamsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceIdList)) {
            body.put("DeviceIdList", request.deviceIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopStreams"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopStreamsResponse());
    }

    public StopStreamsResponse stopStreams(StopStreamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopStreamsWithOptions(request, runtime);
    }

    public SyncDeviceTimeResponse syncDeviceTimeWithOptions(SyncDeviceTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceSn)) {
            body.put("DeviceSn", request.deviceSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceTimeStamp)) {
            body.put("DeviceTimeStamp", request.deviceTimeStamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncDeviceTime"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncDeviceTimeResponse());
    }

    public SyncDeviceTimeResponse syncDeviceTime(SyncDeviceTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncDeviceTimeWithOptions(request, runtime);
    }

    public TestCrossResponse testCrossWithOptions(TestCrossRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("Data", request.data);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestCross"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "string")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestCrossResponse());
    }

    public TestCrossResponse testCross(TestCrossRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.testCrossWithOptions(request, runtime);
    }

    public TryCreateAIInstanceResponse tryCreateAIInstanceWithOptions(TryCreateAIInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TryCreateAIInstanceShrinkRequest request = new TryCreateAIInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataSourceTimes)) {
            request.dataSourceTimesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataSourceTimes, "DataSourceTimes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scheduleCycleDates)) {
            request.scheduleCycleDatesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scheduleCycleDates, "ScheduleCycleDates", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scheduleTimes)) {
            request.scheduleTimesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scheduleTimes, "ScheduleTimes", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmId)) {
            body.put("AlgorithmId", request.algorithmId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cameraNumber)) {
            body.put("CameraNumber", request.cameraNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.computeType)) {
            body.put("ComputeType", request.computeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSource)) {
            body.put("DataSource", request.dataSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceTimesShrink)) {
            body.put("DataSourceTimes", request.dataSourceTimesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            body.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fps)) {
            body.put("Fps", request.fps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleCycleDatesShrink)) {
            body.put("ScheduleCycleDates", request.scheduleCycleDatesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTimesShrink)) {
            body.put("ScheduleTimes", request.scheduleTimesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            body.put("ScheduleType", request.scheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spf)) {
            body.put("Spf", request.spf);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TryCreateAIInstance"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TryCreateAIInstanceResponse());
    }

    public TryCreateAIInstanceResponse tryCreateAIInstance(TryCreateAIInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tryCreateAIInstanceWithOptions(request, runtime);
    }

    public UnbindCorpGroupResponse unbindCorpGroupWithOptions(UnbindCorpGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpGroupId)) {
            body.put("CorpGroupId", request.corpGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindCorpGroup"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindCorpGroupResponse());
    }

    public UnbindCorpGroupResponse unbindCorpGroup(UnbindCorpGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindCorpGroupWithOptions(request, runtime);
    }

    public UnbindDevicesResponse unbindDevicesWithOptions(UnbindDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDeviceIdList)) {
            body.put("SubDeviceIdList", request.subDeviceIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindDevices"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindDevicesResponse());
    }

    public UnbindDevicesResponse unbindDevices(UnbindDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindDevicesWithOptions(request, runtime);
    }

    public UnbindPersonResponse unbindPersonWithOptions(UnbindPersonRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvSubId)) {
            body.put("IsvSubId", request.isvSubId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profileId)) {
            body.put("ProfileId", request.profileId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindPerson"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindPersonResponse());
    }

    public UnbindPersonResponse unbindPerson(UnbindPersonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindPersonWithOptions(request, runtime);
    }

    public UnbindUserResponse unbindUserWithOptions(UnbindUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvSubId)) {
            body.put("IsvSubId", request.isvSubId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindUser"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindUserResponse());
    }

    public UnbindUserResponse unbindUser(UnbindUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindUserWithOptions(request, runtime);
    }

    public UpdateAiotDeviceResponse updateAiotDeviceWithOptions(UpdateAiotDeviceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAiotDeviceShrinkRequest request = new UpdateAiotDeviceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.aiotDevice)) {
            request.aiotDeviceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.aiotDevice, "AiotDevice", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aiotDeviceShrink)) {
            body.put("AiotDevice", request.aiotDeviceShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAiotDevice"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAiotDeviceResponse());
    }

    public UpdateAiotDeviceResponse updateAiotDevice(UpdateAiotDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAiotDeviceWithOptions(request, runtime);
    }

    public UpdateAiotPersonTableResponse updateAiotPersonTableWithOptions(UpdateAiotPersonTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.personTable)) {
            bodyFlat.put("PersonTable", request.personTable);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAiotPersonTable"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAiotPersonTableResponse());
    }

    public UpdateAiotPersonTableResponse updateAiotPersonTable(UpdateAiotPersonTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAiotPersonTableWithOptions(request, runtime);
    }

    public UpdateAiotPersonTableItemResponse updateAiotPersonTableItemWithOptions(UpdateAiotPersonTableItemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personTableId)) {
            body.put("PersonTableId", request.personTableId);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.personTableItem)) {
            bodyFlat.put("PersonTableItem", request.personTableItem);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAiotPersonTableItem"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAiotPersonTableItemResponse());
    }

    public UpdateAiotPersonTableItemResponse updateAiotPersonTableItem(UpdateAiotPersonTableItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAiotPersonTableItemWithOptions(request, runtime);
    }

    public UpdateAiotVehicleTableItemResponse updateAiotVehicleTableItemWithOptions(UpdateAiotVehicleTableItemRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAiotVehicleTableItemShrinkRequest request = new UpdateAiotVehicleTableItemShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.vehicleTableItem)) {
            request.vehicleTableItemShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.vehicleTableItem, "VehicleTableItem", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vehicleTableId)) {
            body.put("VehicleTableId", request.vehicleTableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vehicleTableItemShrink)) {
            body.put("VehicleTableItem", request.vehicleTableItemShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAiotVehicleTableItem"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAiotVehicleTableItemResponse());
    }

    public UpdateAiotVehicleTableItemResponse updateAiotVehicleTableItem(UpdateAiotVehicleTableItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAiotVehicleTableItemWithOptions(request, runtime);
    }

    public UpdateCorpResponse updateCorpWithOptions(UpdateCorpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpName)) {
            body.put("CorpName", request.corpName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iconPath)) {
            body.put("IconPath", request.iconPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvSubId)) {
            body.put("IsvSubId", request.isvSubId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentCorpId)) {
            body.put("ParentCorpId", request.parentCorpId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCorp"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCorpResponse());
    }

    public UpdateCorpResponse updateCorp(UpdateCorpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCorpWithOptions(request, runtime);
    }

    public UpdateDataSourceResponse updateDataSourceWithOptions(UpdateDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            body.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceName)) {
            body.put("DataSourceName", request.dataSourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            body.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataSource"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataSourceResponse());
    }

    public UpdateDataSourceResponse updateDataSource(UpdateDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataSourceWithOptions(request, runtime);
    }

    public UpdateDeviceResponse updateDeviceWithOptions(UpdateDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bitRate)) {
            body.put("BitRate", request.bitRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceAddress)) {
            body.put("DeviceAddress", request.deviceAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceDirection)) {
            body.put("DeviceDirection", request.deviceDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceResolution)) {
            body.put("DeviceResolution", request.deviceResolution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceSite)) {
            body.put("DeviceSite", request.deviceSite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceType)) {
            body.put("DeviceType", request.deviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gbId)) {
            body.put("GbId", request.gbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendor)) {
            body.put("Vendor", request.vendor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDevice"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDeviceResponse());
    }

    public UpdateDeviceResponse updateDevice(UpdateDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDeviceWithOptions(request, runtime);
    }

    public UpdateDeviceCaptureStrategyResponse updateDeviceCaptureStrategyWithOptions(UpdateDeviceCaptureStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceCode)) {
            body.put("DeviceCode", request.deviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceType)) {
            body.put("DeviceType", request.deviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mondayCaptureStrategy)) {
            body.put("MondayCaptureStrategy", request.mondayCaptureStrategy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDeviceCaptureStrategy"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDeviceCaptureStrategyResponse());
    }

    public UpdateDeviceCaptureStrategyResponse updateDeviceCaptureStrategy(UpdateDeviceCaptureStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDeviceCaptureStrategyWithOptions(request, runtime);
    }

    public UpdateDevicesStorageResponse updateDevicesStorageWithOptions(UpdateDevicesStorageRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDevicesStorageShrinkRequest request = new UpdateDevicesStorageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.updateStorageRequests)) {
            request.updateStorageRequestsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.updateStorageRequests, "UpdateStorageRequests", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateStorageRequestsShrink)) {
            body.put("UpdateStorageRequests", request.updateStorageRequestsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDevicesStorage"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDevicesStorageResponse());
    }

    public UpdateDevicesStorageResponse updateDevicesStorage(UpdateDevicesStorageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDevicesStorageWithOptions(request, runtime);
    }

    public UpdateDoubleVerificationGroupResponse updateDoubleVerificationGroupWithOptions(UpdateDoubleVerificationGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.doubleVerificationGroup)) {
            bodyFlat.put("DoubleVerificationGroup", request.doubleVerificationGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDoubleVerificationGroup"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDoubleVerificationGroupResponse());
    }

    public UpdateDoubleVerificationGroupResponse updateDoubleVerificationGroup(UpdateDoubleVerificationGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDoubleVerificationGroupWithOptions(request, runtime);
    }

    public UpdateModelServiceResponse updateModelServiceWithOptions(UpdateModelServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelServiceId)) {
            body.put("ModelServiceId", request.modelServiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelServiceName)) {
            body.put("ModelServiceName", request.modelServiceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qpsRequired)) {
            body.put("QpsRequired", request.qpsRequired);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateModelService"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateModelServiceResponse());
    }

    public UpdateModelServiceResponse updateModelService(UpdateModelServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateModelServiceWithOptions(request, runtime);
    }

    public UpdateMonitorResponse updateMonitorWithOptions(UpdateMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmVendor)) {
            body.put("AlgorithmVendor", request.algorithmVendor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attributeName)) {
            body.put("AttributeName", request.attributeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attributeOperateType)) {
            body.put("AttributeOperateType", request.attributeOperateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attributeValueList)) {
            body.put("AttributeValueList", request.attributeValueList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceList)) {
            body.put("DeviceList", request.deviceList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceOperateType)) {
            body.put("DeviceOperateType", request.deviceOperateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifierAppSecret)) {
            body.put("NotifierAppSecret", request.notifierAppSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifierExtendValues)) {
            body.put("NotifierExtendValues", request.notifierExtendValues);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifierTimeOut)) {
            body.put("NotifierTimeOut", request.notifierTimeOut);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifierType)) {
            body.put("NotifierType", request.notifierType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifierUrl)) {
            body.put("NotifierUrl", request.notifierUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picList)) {
            body.put("PicList", request.picList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picOperateType)) {
            body.put("PicOperateType", request.picOperateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleExpression)) {
            body.put("RuleExpression", request.ruleExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            body.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMonitor"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMonitorResponse());
    }

    public UpdateMonitorResponse updateMonitor(UpdateMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMonitorWithOptions(request, runtime);
    }

    public UpdateProfileResponse updateProfileWithOptions(UpdateProfileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceUrl)) {
            body.put("FaceUrl", request.faceUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gender)) {
            body.put("Gender", request.gender);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idNumber)) {
            body.put("IdNumber", request.idNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvSubId)) {
            body.put("IsvSubId", request.isvSubId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveAddress)) {
            body.put("LiveAddress", request.liveAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNo)) {
            body.put("PhoneNo", request.phoneNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plateNo)) {
            body.put("PlateNo", request.plateNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profileId)) {
            body.put("ProfileId", request.profileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneType)) {
            body.put("SceneType", request.sceneType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProfile"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProfileResponse());
    }

    public UpdateProfileResponse updateProfile(UpdateProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateProfileWithOptions(request, runtime);
    }

    public UpdateProfileCatalogResponse updateProfileCatalogWithOptions(UpdateProfileCatalogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            body.put("CatalogName", request.catalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvSubId)) {
            body.put("IsvSubId", request.isvSubId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProfileCatalog"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProfileCatalogResponse());
    }

    public UpdateProfileCatalogResponse updateProfileCatalog(UpdateProfileCatalogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateProfileCatalogWithOptions(request, runtime);
    }

    public UpdateSearchTableResponse updateSearchTableWithOptions(UpdateSearchTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmId)) {
            body.put("AlgorithmId", request.algorithmId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchTableId)) {
            body.put("SearchTableId", request.searchTableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchTableName)) {
            body.put("SearchTableName", request.searchTableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSearchTable"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSearchTableResponse());
    }

    public UpdateSearchTableResponse updateSearchTable(UpdateSearchTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSearchTableWithOptions(request, runtime);
    }

    public UpdateUserResponse updateUserWithOptions(UpdateUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            body.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.age)) {
            body.put("Age", request.age);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attachment)) {
            body.put("Attachment", request.attachment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceImageContent)) {
            body.put("FaceImageContent", request.faceImageContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceImageUrl)) {
            body.put("FaceImageUrl", request.faceImageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gender)) {
            body.put("Gender", request.gender);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idNumber)) {
            body.put("IdNumber", request.idNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvSubId)) {
            body.put("IsvSubId", request.isvSubId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNo)) {
            body.put("PhoneNo", request.phoneNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plateNo)) {
            body.put("PlateNo", request.plateNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            body.put("UserGroupId", request.userGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUser"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserResponse());
    }

    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserWithOptions(request, runtime);
    }

    public UpdateUserGroupResponse updateUserGroupWithOptions(UpdateUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvSubId)) {
            body.put("IsvSubId", request.isvSubId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            body.put("UserGroupId", request.userGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupName)) {
            body.put("UserGroupName", request.userGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserGroup"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserGroupResponse());
    }

    public UpdateUserGroupResponse updateUserGroup(UpdateUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserGroupWithOptions(request, runtime);
    }

    public UpdateWatchPolicyResponse updateWatchPolicyWithOptions(UpdateWatchPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.itemMatchType)) {
            body.put("ItemMatchType", request.itemMatchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.similarityThreshold)) {
            body.put("SimilarityThreshold", request.similarityThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            body.put("TargetType", request.targetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watchMode)) {
            body.put("WatchMode", request.watchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watchPolicyId)) {
            body.put("WatchPolicyId", request.watchPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watchPolicyName)) {
            body.put("WatchPolicyName", request.watchPolicyName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWatchPolicy"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWatchPolicyResponse());
    }

    public UpdateWatchPolicyResponse updateWatchPolicy(UpdateWatchPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWatchPolicyWithOptions(request, runtime);
    }

    public UpdateWatchTaskResponse updateWatchTaskWithOptions(UpdateWatchTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceList)) {
            body.put("DeviceList", request.deviceList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageReceiver)) {
            body.put("MessageReceiver", request.messageReceiver);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleCycleDates)) {
            body.put("ScheduleCycleDates", request.scheduleCycleDates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTimes)) {
            body.put("ScheduleTimes", request.scheduleTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            body.put("ScheduleType", request.scheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watchPolicyIds)) {
            body.put("WatchPolicyIds", request.watchPolicyIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watchTaskId)) {
            body.put("WatchTaskId", request.watchTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWatchTask"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWatchTaskResponse());
    }

    public UpdateWatchTaskResponse updateWatchTask(UpdateWatchTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWatchTaskWithOptions(request, runtime);
    }

    public UploadFileResponse uploadFileWithOptions(UploadFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            body.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileAliasName)) {
            body.put("FileAliasName", request.fileAliasName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileContent)) {
            body.put("FileContent", request.fileContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            body.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            body.put("FileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.MD5)) {
            body.put("MD5", request.MD5);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadFile"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadFileResponse());
    }

    public UploadFileResponse uploadFile(UploadFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadFileWithOptions(request, runtime);
    }

    public UploadImageResponse uploadImageWithOptions(UploadImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            body.put("ImageUrl", request.imageUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadImage"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadImageResponse());
    }

    public UploadImageResponse uploadImage(UploadImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadImageWithOptions(request, runtime);
    }

    public VerifyDeviceResponse verifyDeviceWithOptions(VerifyDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceAddress)) {
            body.put("DeviceAddress", request.deviceAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            body.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nvrExisted)) {
            body.put("NvrExisted", request.nvrExisted);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyDevice"),
            new TeaPair("version", "2020-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyDeviceResponse());
    }

    public VerifyDeviceResponse verifyDevice(VerifyDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyDeviceWithOptions(request, runtime);
    }
}
